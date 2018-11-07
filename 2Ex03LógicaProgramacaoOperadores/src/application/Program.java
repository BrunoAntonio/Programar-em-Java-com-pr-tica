package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("----------------------------------Exercicio 1-------------------------------");
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int media = (a + b + c + d) / 4;
		System.out.println("Média: " + media);

		System.out.println("");
		System.out.println("----------------------------------Exercicio 2-------------------------------");
		
		int valor = 4000;
		double valorPagar =valor <= 1000 ? valor : 
							valor <= 3000 ? valor * 0.95 : 
							valor * 0.9;
		
		System.out.println("Valor Compra: "+valor );
		System.out.println("Valor a pagar: "+valorPagar );
		
		System.out.println("");
		System.out.println("----------------------------------Exercicio 3-------------------------------");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Valor produto?");
		double valorProduto=sc.nextDouble();
		System.out.println("Taxa de aumento?");
		double taxa=sc.nextDouble();
		
		double valorTotal= valorProduto+valorProduto*taxa/100;
		
		System.out.printf("Valor original do produto: %.2f%n",valorProduto);
		System.out.println("Taxa de aumento: "+taxa+"%");
		System.out.printf("Valor total a pagar: %.2f%n",valorTotal);
		
		sc.close();

	}

}
