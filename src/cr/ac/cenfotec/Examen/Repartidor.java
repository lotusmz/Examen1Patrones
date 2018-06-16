package cr.ac.cenfotec.Examen;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Repartidor {
	
	private Naipe nuevoNaipe;
		
	public Repartidor() {
		
		//this.nuevoNaipe = shuffleNaipe(nuevoNaipe);
		
		nuevoNaipe = new Naipe();
	}

	public Naipe getNuevoNaipe() {
		return nuevoNaipe;
	}

	public void setNuevoNaipe(Naipe nuevoNaipe) {
		this.nuevoNaipe = nuevoNaipe;
	}

	/* static Naipe shuffleNaipe(Naipe nuevoNaipe)
	  {
		
		Carta[] cartas = nuevoNaipe.getCartas();
		
	    Random rnd = ThreadLocalRandom.current();
	    
	    for (int i = cartas.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);

	      Carta a = cartas[index];
	      cartas[index] = cartas[i];
	      cartas[i] = a;
	    }
	    
	    nuevoNaipe.setCartas(cartas);
	    
	    return nuevoNaipe;
	  }*/
	
}
