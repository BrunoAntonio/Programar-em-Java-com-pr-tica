package entities;

public class Calculo {

	public static double somar(double ... numeros) {
		double resultado=0;
		
		for(double numero : numeros) {
			resultado +=numero;
		}
		return resultado;
	}
	
	
	
	
	
}
