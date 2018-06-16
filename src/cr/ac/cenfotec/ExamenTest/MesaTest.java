package cr.ac.cenfotec.ExamenTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import cr.ac.cenfotec.Examen.Carta;
import cr.ac.cenfotec.Examen.Jugador;
import cr.ac.cenfotec.Examen.Mesa;

public class MesaTest {
	
	String nombre;
	Mesa nuevaMesa;
	Jugador nuevoJugador;
	
	@Test
	public void testMesaIniciaSinJugadores() throws Exception {
		nuevaMesa = new Mesa();
		ArrayList<Jugador> jugador = nuevaMesa.getJugadores();
		
		assertEquals(0, jugador.size());
	
	}
	
	@Test
	public void testAgregarJugador() throws Exception {
		nombre = "Mary Paz";
		nuevoJugador = new Jugador(nombre);
		nuevaMesa = new Mesa();
		ArrayList<Jugador> jugador = nuevaMesa.getJugadores();
		
		nuevaMesa.agregarJugadores(nuevoJugador);
		assertEquals(1, jugador.size());
	}
	
	@Test(expected=Exception.class)
	public void testErrorMesaLlena() throws Exception {
		nombre = "Mary Paz";
		nuevoJugador = new Jugador(nombre);
		nuevaMesa = new Mesa();
		ArrayList<Jugador> jugador = nuevaMesa.getJugadores();
		
		for(int i=0;i<4;i++){
			nuevaMesa.agregarJugadores(nuevoJugador);
		}
		
		//Mesa llena, debería dar error al agregarle otro jugador
		
		nuevaMesa.agregarJugadores(nuevoJugador);
		
		assertEquals(5, jugador.size());
	}
	
	

}
