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
		Carta diez = new Carta(NombreValor.DIEZ,Palo.FLORES);
		Carta dos = new Carta(NombreValor.DOS, Palo.GOTAS);
		
		for(int i=0;i<mano.size();i++) {
			
			if(mano.size() > 2) 
			{
				valor += mano.get(i).getNombreValor().getValor();
				
			}else if(mano.size() == 2) {
				if((mano.get(0).getNombreValor() == diez.getNombreValor() || 
					mano.get(0).getNombreValor() == dos.getNombreValor())
					&& (mano.get(1).getNombreValor() == diez.getNombreValor()
					|| mano.get(1).getNombreValor() == dos.getNombreValor())) 
				{
					valor = 21;
				}
			}else {valor += mano.get(i).getNombreValor().getValor();}
				
		}
			
		return valor;
	}
			
	@Override
	public boolean equals(Object o) {
	    return this == o;
	}
	
}
