package cr.ac.cenfotec.ExamenTest;

import static org.junit.Assert.*;

import org.junit.Test;

import cr.ac.cenfotec.Examen.Jugador;
import cr.ac.cenfotec.Examen.Mesa;
import cr.ac.cenfotec.Examen.Repartidor;

public class RepartidorTest {

	Repartidor nuevoRepartidor;
	Mesa nuevaMesa = new Mesa();;
	Jugador	jugadorEnMesa = new Jugador("MaryPaz");;
	
	
	@Test
	public void testNaipeRepartidor() {
		
		nuevoRepartidor = new Repartidor();
		
		assertNotNull(nuevoRepartidor);
	}
	
	@Test
	public void testDarCarta() throws Exception {
		
		nuevaMesa.agregarJugadores(jugadorEnMesa);
		nuevoRepartidor = nuevaMesa.getRepartidor();
		nuevoRepartidor.darCarta(jugadorEnMesa);
		
		//Comprueba que en efecto el jugador tenga una carta
		assertNotNull(jugadorEnMesa.getMano());
		
		//Verifica que se haya restado una carta al naipe
		assertEquals(51, nuevoRepartidor.getNuevoNaipe().getCartas().size());
	}

}
