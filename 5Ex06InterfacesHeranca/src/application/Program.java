package application;

import entities.JavaProgrammer;
import entities.Redes;
import entities.Vendavel;

public class Program {

	public static void main(String[] args) {
		
		JavaProgrammer java = new JavaProgrammer("Java",30,8.0);
		Redes redes = new Redes("Redes",40,"Windows");
		
		Vendavel.info(redes, 1);
		
		Vendavel.info(java, 2);
		
	}

}
