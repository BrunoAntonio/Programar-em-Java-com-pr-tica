package entities;

public class Programador extends Funcionario {

	private String linguagem;

	public Programador() {
		super();
	}

	public Programador(String nome, int idade, double salario, Endereco endereco, String linguagem) {
		super(nome, idade, salario, endereco);
		this.linguagem = linguagem;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	@Override
	public String toString() {
		return super.toString() 
				+ "Linguagem=" + getLinguagem() + "\n";
	}

}
