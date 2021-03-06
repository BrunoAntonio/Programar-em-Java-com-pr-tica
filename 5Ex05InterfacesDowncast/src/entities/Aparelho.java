package entities;

public interface Aparelho {

	public void ligar(); 
	public void desligar(); 
	
	default void temporizador(int tempo) {
		System.out.println("Ser� desligado em: "+tempo+" min");
	}
	
	static void desligarTudo(Aparelho[]aparelhos) {
		for(Aparelho a: aparelhos) {
			a.desligar();
		}
	}
	
}
