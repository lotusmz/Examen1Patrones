package cr.ac.cenfotec.Examen;

import java.util.ArrayList;

public class Naipe {
	
	private ArrayList<Carta> cartas;
	
	public Naipe() {
						
			cartas = new ArrayList<Carta>();
		
			for(Palo palo : Palo.values()) {
			
				for (NombreValor carta : NombreValor.values()) {
					
					cartas.add(new Carta(carta, palo)); 
										
				}
			}

	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	
}
