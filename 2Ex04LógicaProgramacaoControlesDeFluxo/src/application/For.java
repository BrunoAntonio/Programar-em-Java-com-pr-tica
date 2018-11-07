package application;

public class For {

	public static void main(String[] args) {

		for (int x = 0; x <= 5; x++) {
			System.out.println("valor de x: " + x);
		}

		System.out.println("--------------------------------------------");

		int i = 0;
		for (; i <= 5; i++) {
			System.out.println("valor de i: " + i);
		}

		System.out.println("--------------------------------------------");

		int y = 0;
		for (; y <= 5; System.out.println("valor de y: " + y)) {
			y++;
		}

	}

}
