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

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	
}
