package Practica1_Parte2;


public class MainCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cartera cartera = new Cartera();
	
		for (int i = 0; i < 10; i++) {
			
			new Client(cartera).start();
			new Worker(cartera).start();
		}	
	}
}
