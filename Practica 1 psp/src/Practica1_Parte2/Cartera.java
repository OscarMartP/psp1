package Practica1_Parte2;
import java.util.Random;
import java.util.Scanner;

public class Cartera {
	
	Scanner sc = new Scanner(System.in);
	
	private static int dineroDisponible;
	private static int retirarDInero;
	private static int ingresarDinero;
	
	public Cartera() {
		dineroDisponible = 100;
	}
	
	

public synchronized int Retiro() 
{

	
	try {
		Thread.sleep( 1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	Random numeroAleatorio = new Random();
	int N = numeroAleatorio.nextInt(100);
	retirarDInero = N;
	
	retirarDInero  += dineroDisponible;
	
	return retirarDInero;
	
	
}
public synchronized int Ingresar()
{
	
	try {
		Thread.sleep( 1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	Random numeroAleatorio = new Random();
	int N = numeroAleatorio.nextInt(100);
	ingresarDinero = N;
	
	ingresarDinero  += dineroDisponible;
	
	return ingresarDinero;
	
	
	
}

public void  VisualizarCantidad()
{
	System.out.println("Tienes " + dineroDisponible + " € en la cuenta.");
}
public static int getIngresarDinero() {
	return ingresarDinero;
}
public static void setIngresarDinero(int ingresarDinero) {
	Cartera.ingresarDinero = ingresarDinero;
}

public static int getRetirarDInero() {
	return retirarDInero;
}

}
