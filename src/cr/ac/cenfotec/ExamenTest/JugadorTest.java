package cr.ac.cenfotec.ExamenTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import cr.ac.cenfotec.Examen.Carta;
import cr.ac.cenfotec.Examen.Jugador;
import cr.ac.cenfotec.Examen.NombreValor;
import cr.ac.cenfotec.Examen.Palo;

public class JugadorTest {

	Jugador nuevoJugador = new Jugador();
	ArrayList<Carta> mano = new ArrayList<Carta>();
	
	@Test
	public void testDiferencia() {
		
		Carta nuevaCarta = new Carta(NombreValor.CINCO, Palo.ESCUDOS);
		Carta nuevaCartaII = new Carta(NombreValor.AS, Palo.ESTRELLAS);
		mano.add(nuevaCarta);
		mano.add(nuevaCartaII);
		nuevoJugador.setMano(mano);
		
		assertEquals(6, nuevoJugador.calcularValorMano());
	}
}
