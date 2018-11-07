package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Peso: ");
		double peso=sc.nextDouble();
		
		System.out.print("Altura: ");
		double altura=sc.nextDouble();
		
		double imc=peso/(altura*altura);
		
		if (imc<=18.5) {
			System.out.printf("O seu IMC � %.2f: abaixo do peso",imc);
		}else if (imc>18.5 && imc <=25) {
			System.out.printf("O seu IMC � %.2f: peso normal",imc);
		}else if(imc>25 && imc <=30) {
			System.out.printf("O seu IMC � %.2f: acima do peso",imc);
		}else {
			System.out.printf("O seu IMC � %.2f: obsidade",imc);
		}
		
		
		sc.close();
		
	}

}
