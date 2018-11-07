package application;

public class IfElse {

	public static void main(String[] args) {

		double valorDaCompra = 2500;
		double valorAPagar;

		if (valorDaCompra >= 2000) {
			valorAPagar = valorDaCompra * 0.90;
		} else if (valorDaCompra >= 1000) {
			valorAPagar = valorDaCompra * 0.95;
		} else {
			valorAPagar = valorDaCompra;
		}
		
		System.out.printf("Valor a pagar: %.2f%n", valorAPagar);
	}
}
