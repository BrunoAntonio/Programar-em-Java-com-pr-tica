package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("N�mero: ");
		int dividendo = sc.nextInt();
		int divisoes = 0;

		for (int divisor = 1; divisor <= dividendo; divisor++) {
			if (dividendo % divisor == 0) 
				divisoes++;
			}
			if (divisoes <= 2) {
				System.out.println(dividendo + " � primo. divisivel por " + divisoes + " n�meros.");
			} else {
				System.out.println(dividendo + " n�o � primo. divisivel por " + divisoes + " n�meros.");
			}
			sc.close();
		}

	

}
