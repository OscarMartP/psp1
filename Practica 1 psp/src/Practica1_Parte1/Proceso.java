package Practica1_Parte1;
import java.util.Random;

public class Proceso extends Thread {
	
	Random numeroAleatorio = new Random();
	int N = numeroAleatorio.nextInt(5);
	
	
	public void run()
	{
		System.out.println("Soy el hilo " + getName() + " y me pongo a dormir en "  + N + " segundos." + 
				"\nSoy el hilo " + getName() + "y he terminado de dormir" );
		
		
		
	}
	
	
		
		
	
	
}
