package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primeira nota: ");
		double nota1=sc.nextDouble();
		
		System.out.print("Segunda nota: ");
		double nota2=sc.nextDouble();
		
		System.out.print("Terceira nota: ");
		double nota3=sc.nextDouble();
		
		double media=(nota1+nota2+nota3)/3;
		
		if (media<=5) {
			System.out.printf("A sua m�dia � %.2f: reprovado",media);
		}else if (media < 7) {
			System.out.printf("A sua m�dia � %.2f: em recupera��o",media);
		}else {
			System.out.printf("A sua m�dia � %.2f: aprovado",media);
		}
		
		
		sc.close();
		
	}

}
