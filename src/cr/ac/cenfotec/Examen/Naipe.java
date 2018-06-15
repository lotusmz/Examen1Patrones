package cr.ac.cenfotec.Examen;

public class Naipe {
	
	private Carta[] cartas;
	private int naipeCompleto = 52;
	
	public Naipe() {}
	
	public Naipe(Carta[] cartas, int naipeCompleto) {
		this.cartas = cartas;
		this.naipeCompleto = naipeCompleto;
	}
	public Carta[] getCartas() {
		return cartas;
	}
	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}
	public int getNaipeCompleto() {
		return naipeCompleto;
	}
	public void setNaipeCompleto(int naipeCompleto) {
		this.naipeCompleto = naipeCompleto;
	}
	
}
