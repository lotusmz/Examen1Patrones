package cr.ac.cenfotec.Examen;

import java.util.ArrayList;

public class Mesa {
	
	private Repartidor repartidor;
	private ArrayList<Jugador> jugadores;
	
	public Mesa() {
		
		jugadores = new ArrayList<Jugador>();
		repartidor = new Repartidor();
	}

	public void agregarJugadores(Jugador jugador) throws Exception {
		
		int maxJugadores = jugadores.size();
		
		if(maxJugadores <= 3) {
			
			jugadores.add(jugador);
		
		}else if (maxJugadores == 4) {
			
			throw new Exception ("No se pueden agregar más jugadores, mesa llena");
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
	
	public Jugador obtenerGanador() {
		Jugador ganador = new Jugador();
		ArrayList<Carta> mano = new ArrayList<Carta>();
		
		for (int i=0;i<jugadores.size();i++) {}
		
		return ganador;
		
	}
	
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public Repartidor getRepartidor() {
		return repartidor;
	}
	
}
