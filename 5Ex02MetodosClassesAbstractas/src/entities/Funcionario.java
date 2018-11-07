package entities;

public abstract class Funcionario {

	private String nome;
	private int idade;
	private boolean estadoCivil;
	private String endereco;
	private String telefone;
	protected double salario;
	

	public Funcionario() {
	}

	public Funcionario(String nome, int idade, boolean estadoCivil, String endereco, String telefone, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.estadoCivil = estadoCivil;
		this.endereco = endereco;
		this.telefone = telefone;
		this.salario = salario;
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

	public boolean isEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(boolean estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public abstract void reajustarSalario ();

	@Override
	public String toString() {
		return "Nome=" + nome +"\n"
				+ "Idade=" + idade+"\n"
				+ "Estado Civil=" + estadoCivil +"\n"
				+ "Endereco="+ endereco +"\n"
				+ "Telefone=" + telefone +"\n"
				+ "Salario=" + String.format("%.2f", getSalario())+"\n";
	}
	
	
	
	
}
