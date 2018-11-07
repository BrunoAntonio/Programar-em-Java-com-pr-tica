package application;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		
		Carro carro=new Carro("Jaguar", "Sedã" ,2016,"Verde",4);
		
		System.out.println(carro.toString());
		
		
		Carro car= new Carro();
		car.setAno(2018);
		
		System.out.println(car.toString());
	}

}
