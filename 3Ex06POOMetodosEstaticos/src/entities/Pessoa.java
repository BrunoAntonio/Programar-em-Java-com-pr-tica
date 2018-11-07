package entities;

public class Pessoa {

	public static void exebirInformacao (String nome) {
		System.out.println("O meu nome é: "+nome);
	}

	public static void exebirInformacao (int idade) {
		System.out.println("A minha idade é: "+idade);
	}
	
	public static  void exebirInformacao (boolean estadoCivil) {
		if (estadoCivil ==true) {
			System.out.println("Casada");
		}else {
			System.out.println("Solteira");
		}
	}
	
	
	
	
}
