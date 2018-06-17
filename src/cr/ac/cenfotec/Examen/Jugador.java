package cr.ac.cenfotec.Examen;

import java.util.ArrayList;

public class Jugador {
	
	private String nombre;
	private ArrayList<Carta> mano;

	public Jugador(String nombre) {
		
		mano = new ArrayList<Carta>();
		this.nombre = nombre;

	}

	public Jugador() {

	}

	
	public ArrayList<Carta> getMano() {
		return mano;
	}

	public void setMano(ArrayList<Carta> mano) {
		this.mano = mano;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int calcularValorMano() {
		int valor = 0;
			for(int i=0;i<mano.size();i++) {
				valor += mano.get(i).getNombreValor().getValor();
			}
		return valor;
	}
			
	@Override
	public boolean equals(Object o) {
	    return this == o;
	}
	
}
