package entities;

public abstract class Funcionario {

	private static final String NOME_EMPRESA ="XPTO";
	private String nome;
	private int idade;
	protected double salario;
	private Endereco endereco;
		
	public Funcionario() {
	}

	public Funcionario(String nome, int idade, double salario, Endereco endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public final void trabalhar() {
		System.out.println("A trabalhar...");
	}

	@Override
	public String toString() {
		return "Nome empresa=" + NOME_EMPRESA +"\n"
				+"Nome=" + getNome() +"\n"
				+ "Idade=" + getIdade()+"\n"
				+ "Endereco="+ getEndereco() +"\n"
				+ "Salario=" + String.format("%.2f", getSalario())+"\n";
	}
	
	
	
	
}
