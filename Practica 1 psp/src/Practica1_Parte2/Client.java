package Practica1_Parte2;
import java.util.Random;
import java.util.Scanner;

public class Client extends Thread{
	
	Cartera cartera;

	public Client(Cartera cartera) {
		super();
		this.cartera = cartera;
	}

	public void run()
	{
		System.out.println("Soy el hilo " + getName() + "y acabo de ingresar dinero" + cartera.Ingresar() );
		
		
		
	}
	
	
	
	
}
