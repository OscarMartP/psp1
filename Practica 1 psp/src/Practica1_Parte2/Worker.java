package Practica1_Parte2;

public class Worker extends Thread{

	Cartera cartera;

	public Worker(Cartera cartera) {
		super();
		this.cartera = cartera;
	}
	
	public void run()
	{
		System.out.println("Soy el hilo " + getName() + "y acabo de retirar dinero" + cartera.Retiro() );
		
		
		
	}
	
	
}
