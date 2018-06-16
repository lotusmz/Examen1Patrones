package cr.ac.cenfotec.ExamenTest;

import static org.junit.Assert.*;

import org.junit.Test;

import cr.ac.cenfotec.Examen.Carta;
import cr.ac.cenfotec.Examen.NombreValor;
import cr.ac.cenfotec.Examen.Palo;

public class CartaTest {
	
	Carta cartaI = new Carta();
	Carta cartaII= new Carta();
	
	@Test
	public void testIgualdad() {
		
		Carta nuevaCarta = new Carta(NombreValor.AS, Palo.ESCUDOS);
		Carta nuevaCartaII = new Carta(NombreValor.AS, Palo.ESTRELLAS);
		
		assertEquals(true, nuevaCarta.equals(nuevaCartaII));
	}
	
	@Test
	public void testDiferencia() {
		
		Carta nuevaCarta = new Carta(NombreValor.CINCO, Palo.ESCUDOS);
		Carta nuevaCartaII = new Carta(NombreValor.AS, Palo.ESTRELLAS);
		
		assertEquals(false, nuevaCarta.equals(nuevaCartaII));
	}
	
	

}
