package cr.ac.cenfotec.Examen;

public class Naipe {
	
	private Carta[] cartas;
	
	public Naipe() {
			
			int i = 0;
			cartas = new Carta[52];
			
			for(Palo palo : Palo.values()) {
			
				for (NombreValor carta : NombreValor.values()) {
					
					this.cartas[i] = new Carta(carta, palo); 
					i++;
					
				}
			}

	}

	public Carta[] getCartas() {
		return cartas;
	}

	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}
	
}
