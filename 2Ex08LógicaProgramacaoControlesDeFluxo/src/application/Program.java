package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Número: ");
		int numb = sc.nextInt();

		if (numb % 2 == 0) {
			System.out.println(numb + " é par");
		} else {
			System.out.println(numb + " é impar");
		}

		sc.close();

	}

}
