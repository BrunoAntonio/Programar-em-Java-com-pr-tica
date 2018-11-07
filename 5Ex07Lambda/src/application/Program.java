package application;

import entities.Calculo;

public class Program {

	public static void main(String[] args) {

		Calculo calculo = (a, b) -> a + b;
		System.out.println(calculo.calcular(2, 4));

		calculo = (a, b) -> a / b;
		System.out.println(calculo.calcular(2, 4));

		Calculo[] calculos = { (x, y) -> x + y, (x, y) -> x - y, (x, y) -> x * y, (x, y) -> x / y };

		for(Calculo c : calculos) {
			System.out.println(c.calcular(2, 4));
		}
		
	}

}
