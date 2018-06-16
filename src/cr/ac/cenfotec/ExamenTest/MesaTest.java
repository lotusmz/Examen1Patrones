package cr.ac.cenfotec.ExamenTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import cr.ac.cenfotec.Examen.Carta;
import cr.ac.cenfotec.Examen.Jugador;
import cr.ac.cenfotec.Examen.Mesa;

public class MesaTest {
	
	String nombre = "Mary Paz";
	Mesa nuevaMesa = new Mesa();
	Jugador nuevoJugador = new Jugador(nombre);
	
	@Test
	public void testMesaIniciaSinJugadores() throws Exception {
		nuevaMesa = new Mesa();
		ArrayList<Jugador> jugador = nuevaMesa.getJugadores();
		
		assertEquals(0, jugador.size());
	
	}
	
	@Test
	public void testAgregarJugador() throws Exception {

		ArrayList<Jugador> jugador = nuevaMesa.getJugadores();
		
		nuevaMesa.agregarJugadores(nuevoJugador);
		assertEquals(1, jugador.size());
	}
	
	@Test(expected=Exception.class)
	public void testErrorMesaLlena() throws Exception {
		ArrayList<Jugador> jugador = nuevaMesa.getJugadores();
		
		for(int i=0;i<4;i++){
			nuevaMesa.agregarJugadores(nuevoJugador);
		}
		
		//Mesa llena, debería dar error al agregarle otro jugador
		
		nuevaMesa.agregarJugadores(nuevoJugador);
		
		assertEquals(5, jugador.size());
	}
	
	@Test
	public void testEmpezarAJugar21() throws Exception {
		Jugador nuevoJugadorII = new Jugador("Alonso");
		Jugador nuevoJugadorIII = new Jugador("Pedro");
		ArrayList<Jugador> jugador = nuevaMesa.getJugadores();
		nuevaMesa.agregarJugadores(nuevoJugador);
		nuevaMesa.agregarJugadores(nuevoJugadorII);
		nuevaMesa.agregarJugadores(nuevoJugadorIII);
		
		assertEquals(3, jugador.size());
		nuevaMesa.empezarAJugar21();
		assertEquals(2, jugador.get(0).getMano().size());
		
	}

}
