package cr.ac.cenfotec.ExamenTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import cr.ac.cenfotec.Examen.Carta;
import cr.ac.cenfotec.Examen.Jugador;
import cr.ac.cenfotec.Examen.Mesa;
import cr.ac.cenfotec.Examen.Naipe;
import cr.ac.cenfotec.Examen.NombreValor;
import cr.ac.cenfotec.Examen.Palo;

public class MesaTest {
	
	Mesa nuevaMesa = new Mesa();
	Jugador nuevoJugador = new Jugador("Mary Paz");
	Jugador nuevoJugadorII = new Jugador("Alonso");
	Jugador nuevoJugadorIII = new Jugador("Pedro");
	ArrayList<Jugador> jugador = nuevaMesa.getJugadores();
	ArrayList<Carta> mano = new ArrayList<Carta>();
	ArrayList<Carta> manoII = new ArrayList<Carta>();
	Carta carta = new Carta();
	Naipe nuevoNaipe = new Naipe();
	
	@Test
	public void testMesaIniciaSinJugadores() throws Exception {
		nuevaMesa = new Mesa();
	
		assertEquals(0, jugador.size());
	
	}
	
	@Test
	public void testAgregarJugador() throws Exception {
		
		nuevaMesa.agregarJugadores(nuevoJugador);
		assertEquals(1, jugador.size());
	}
	
	@Test(expected=Exception.class)
	public void testErrorMesaLlena() throws Exception {
		
		for(int i=0;i<4;i++){
			nuevaMesa.agregarJugadores(nuevoJugador);
		}
		
		//Mesa llena, deber�a dar error al agregarle otro jugador
		
		nuevaMesa.agregarJugadores(nuevoJugador);
		
		assertEquals(5, jugador.size());
	}
	
	@Test
	public void testEmpezarAJugar21() throws Exception {

		nuevaMesa.agregarJugadores(nuevoJugador);
		nuevaMesa.agregarJugadores(new Jugador("Alonso"));
		nuevaMesa.agregarJugadores(new Jugador("Pedro"));
		
		assertEquals(3, jugador.size());
		nuevaMesa.empezarAJugar21();
		assertEquals(2, jugador.get(0).getMano().size());
		
	}
	
	@Test
	public void testGanador() throws Exception {

		mano.add(new Carta(NombreValor.AS, Palo.ESTRELLAS));
		mano.add(new Carta(NombreValor.CUATRO, Palo.ESCUDOS));
		manoII.add(new Carta(NombreValor.AS, Palo.FLORES));
		manoII.add(new Carta(NombreValor.DIEZ, Palo.ESTRELLAS));
		nuevoJugadorII.setMano(mano);
		nuevoJugadorIII.setMano(manoII);
		nuevaMesa.agregarJugadores(nuevoJugadorII);
		nuevaMesa.agregarJugadores(nuevoJugadorIII);
		
		assertTrue(nuevaMesa.obtenerGanador().contains(nuevoJugadorIII));
		
	}
	
	@Test
	public void testEmpate() throws Exception {
		ArrayList<Carta> manoNueva = new ArrayList<Carta>();
		ArrayList<Carta> manoNuevaII = new ArrayList<Carta>();
		Jugador jugadorII = new Jugador("Pablo");
		Jugador jugadorIII = new Jugador("Marmol");
		Mesa mesaNueva = new Mesa();
		
		manoNueva.add(new Carta(NombreValor.AS, Palo.ESTRELLAS));
		manoNueva.add(new Carta(NombreValor.DIEZ, Palo.ESCUDOS));
		manoNuevaII.add(new Carta(NombreValor.AS, Palo.FLORES));
		manoNuevaII.add(new Carta(NombreValor.DIEZ, Palo.ESTRELLAS));
		jugadorII.setMano(manoNueva);
		jugadorIII.setMano(manoNuevaII);
		mesaNueva.agregarJugadores(jugadorII);
		mesaNueva.agregarJugadores(jugadorIII);
		
		assertTrue(mesaNueva.obtenerGanador().contains(jugadorII));
		assertTrue(mesaNueva.obtenerGanador().contains(jugadorIII));
	}

}
