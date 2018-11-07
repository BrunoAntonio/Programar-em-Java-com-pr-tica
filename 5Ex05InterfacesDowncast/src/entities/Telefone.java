package entities;

public class Telefone implements Aparelho {

	@Override
	public void ligar() {
		System.out.println("A ligar o telefone...");
	}
	@Override
	public void desligar() {
		System.out.println("A desligar o telefone...");
	}
	
	public void chamar() {
		System.out.println("A chamar...");
	}
	
}
