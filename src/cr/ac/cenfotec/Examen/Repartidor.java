package cr.ac.cenfotec.Examen;

import java.util.ArrayList;
import java.util.Random;

public class Repartidor {
	
	private Naipe nuevoNaipe;
		
	public Repartidor() {
		
		nuevoNaipe = new Naipe();
		ArrayList<Carta> deck = nuevoNaipe.getCartas();
		nuevoNaipe = shuffleNaipe(deck);
		
	}

	public Naipe getNuevoNaipe() {
		return nuevoNaipe;
	}
	
	public void darCarta(Jugador jugador) {
		
		jugador.getMano().add(nuevoNaipe.getCartas().remove(0));
	}

	
	public Naipe shuffleNaipe(ArrayList<Carta> deck){
		Naipe naipeBarajado = new Naipe();
		ArrayList<Carta> shuffledDeck = new ArrayList<Carta>();
		
		int r = 0;
		while (deck.size() > 0){
			Random carta = new Random();
			r = carta.nextInt(deck.size());
			Carta temp = deck.remove(r);
			shuffledDeck.add(temp);
		}
		
		naipeBarajado.setCartas(shuffledDeck);
		
		return naipeBarajado;
	}
}
