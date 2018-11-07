package application;

import java.util.Locale;

import entities.Poligono;
import entities.Quadrado;
import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		Triangulo t1= new Triangulo(15,20);
		Triangulo t2= new Triangulo(7,4);
		Quadrado q1 = new Quadrado(10);
		Quadrado q2 = new Quadrado(3);
		Poligono [] poligono = {t1,t2,q1,q2};
		

		for(Poligono p : poligono) {
			p.calculoArea();
			System.out.println(p);
		}
		
		System.out.println();
		
		for(int i=0; i<poligono.length; i++) {
			poligono[i].calculoArea();
			System.out.println(poligono[i].toString());
		}
		
		
	}

}
