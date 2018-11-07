package application;

import java.util.Locale;

import entities.Calculo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double a=5;
		double b=4;
		
		Calculo calculo=new Calculo();
		
		System.out.printf("Soma: %.2f%n", calculo.somar(a, b));
		System.out.printf("Divis�o: %.2f%n", calculo.dividir(a, b));
		System.out.printf("Multiplica��o: %.2f%n", calculo.multiplicar(a, b));
		System.out.printf("Subtra��o: %.2f%n", calculo.subtrair(a, b));
		
		
		}

}