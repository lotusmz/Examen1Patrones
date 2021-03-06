package cr.ac.cenfotec.Examen;

import java.util.ArrayList;
import java.util.Collections;

public class Mesa {
	
	private Repartidor repartidor;
	private ArrayList<Jugador> jugadores;
	private ArrayList<Carta> deck;
	
	public Mesa() {
		
		jugadores = new ArrayList<Jugador>();
		repartidor = new Repartidor();
	}

	public void agregarJugadores(Jugador jugador) throws Exception {
		
		int maxJugadores = jugadores.size();
		
		if(maxJugadores <= 3) {
			
			jugadores.add(jugador);
		
		}else if (maxJugadores == 4) {
			
			throw new Exception ("No se pueden agregar m�s jugadores, mesa llena");
		}
		
	}
	
	public void empezarAJugar21() {
		Jugador jugadorADarCarta = new Jugador();
		
		for(int c=0;c<2;c++) {
			for(int i=0;i<jugadores.size();i++) {
				
				jugadorADarCarta = jugadores.get(i);
				repartidor.darCarta(jugadorADarCarta);
							
			}
		}
		
	}
	
	public void empezarPartidaDeRon() {
		Jugador jugadorADarCarta = new Jugador();
		
		for(int c=0;c<7;c++) {
			for(int i=0;i<jugadores.size();i++) {
				
				jugadorADarCarta = jugadores.get(i);
				repartidor.darCarta(jugadorADarCarta);
							
			}
		}
		
		deck = repartidor.getNuevoNaipe().getCartas();
	}
	
	
	public ArrayList<Jugador> obtenerGanador() {
		ArrayList<Jugador> ganador = new ArrayList<Jugador>();
		int manoJugador = 0;
		int manoGanadora = 100;
		
		for (int i=0;i<jugadores.size();i++) {
			
			manoJugador = 21 - jugadores.get(i).calcularValorMano();
			
			if(manoJugador < manoGanadora && manoJugador >= 0){
				
				manoGanadora = manoJugador;
				
				ganador = new ArrayList<Jugador>();
				ganador.add(jugadores.get(i));
			
			}else if(manoJugador == manoGanadora){
				ganador.add(jugadores.get(i));
			}
		
		}
		
		return ganador;
		
	}
	
	public boolean verificarCambio(Jugador jugador) {
		boolean cartasCambiadas = false;
		ArrayList<Carta> mano = jugador.getMano();
		Carta jota = new Carta(NombreValor.JOTA, Palo.ESTRELLAS);
		Carta quina = new Carta(NombreValor.QUINA, Palo.ESTRELLAS);
		Carta ka = new Carta(NombreValor.KA, Palo.ESTRELLAS);
		Carta tres = new Carta(NombreValor.TRES, Palo.ESTRELLAS);
		
		for(int m=0;m<mano.size();m++) {
			
			if(mano.get(m).getNombreValor() == jota.getNombreValor() || mano.get(m).getNombreValor() == quina.getNombreValor() || mano.get(m).getNombreValor() == ka.getNombreValor() || mano.get(m).getNombreValor() == tres.getNombreValor()) {
								
				mano.remove(m);
				repartidor.darCarta(jugador);
				cartasCambiadas = true;
			
			}
			
		}
		
		return cartasCambiadas;
	}
	
	public void reset() {
		repartidor.setNuevoNaipe(new Naipe());
		this.deck = null;
		jugadores = new ArrayList<Jugador>();
	}
	
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public Repartidor getRepartidor() {
		return repartidor;
	}

	public ArrayList<Carta> getDeck() {
		return deck;
	}

	
}
