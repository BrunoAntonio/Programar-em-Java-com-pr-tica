package application;

import entities.Cao;

public class Program {

	public static void main(String[] args) {
		
		Cao cao=new Cao();
		
		cao.setNome("Bobi");
		cao.setRaca("Pastor Alemão");
		cao.setIdade(2);
		
		System.out.print(cao.toString());
		
	}

}
