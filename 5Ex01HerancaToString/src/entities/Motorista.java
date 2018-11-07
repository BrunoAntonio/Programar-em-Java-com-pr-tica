package entities;

public class Motorista extends Funcionario {

	private int nrCnh;
	private int tempoDeExperiencia;

	public Motorista(String nome, int idade, boolean estadoCivil, String endereco, String telefone, double salario,
			int nrCnh, int tempoDeExperiencia) {
		super(nome, idade, estadoCivil, endereco, telefone, salario);
		this.nrCnh = nrCnh;
		this.tempoDeExperiencia = tempoDeExperiencia;
	}

	public int getNrCnh() {
		return nrCnh;
	}

	public void setNrCnh(int nrCnh) {
		this.nrCnh = nrCnh;
	}

	public int getTempoDeExperiencia() {
		return tempoDeExperiencia;
	}

	public void setTempoDeExperiencia(int tempoDeExperiencia) {
		this.tempoDeExperiencia = tempoDeExperiencia;
	}

	public void dirigir() {
		System.out.println("Dirigindo...");
	}

	@Override
	public void reajustarSalario() {
		salario += 300;
	}

	@Override
	public String toString() {
		return super.toString() 
				+ "nrCnh=" + nrCnh + "\n" 
				+ "Tempo de experiencia=" + tempoDeExperiencia + "\n";
	}

}
