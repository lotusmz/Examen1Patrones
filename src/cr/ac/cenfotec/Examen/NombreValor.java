package cr.ac.cenfotec.Examen;

public enum NombreValor {
	AS(1),
	DOS(2),
	TRES(3),
	CUATRO(4),
	CINCO(5),
	SEIS(6),
	SIETE(7),
	OCHO(8),
	NUEVE(9),
	DIEZ(10),
	JOTA(10),
	QUINA(10),
	KA(10);
	
	private final int valor;
	NombreValor(final int valor)
	{
		this.valor = valor;		
	}
	
	public int getValor() {return valor;}
}
