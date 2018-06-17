package cr.ac.cenfotec.Examen;

public class Carta {
	private NombreValor nombreValor;
	private Palo palo;
	
	public Carta() {}
		
	public Carta(NombreValor nombreValor, Palo palo) {
		this.nombreValor = nombreValor;
		this.palo = palo;
	}

	public NombreValor getNombreValor() {
		return nombreValor;
	}

	public Palo getPalo() {
		return palo;
	}
			
	public void setNombreValor(NombreValor nombreValor) {
		this.nombreValor = nombreValor;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if(!(o instanceof Carta))
			return false;
		
		Carta carta = (Carta) o;
		
		return nombreValor.getValor() == carta.nombreValor.getValor();
	}
	
	
}
