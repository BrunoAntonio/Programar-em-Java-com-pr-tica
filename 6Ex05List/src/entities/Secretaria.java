package entities;

public class Secretaria extends Funcionario{

	private int nrSrt;
	private boolean linguaInglesa;
	
	public Secretaria() {
		super();
	}

	public Secretaria(String nome, int idade, boolean estadoCivil, String endereco, String telefone, double salario,
			int nrSrt, boolean linguaInglesa) {
		super(nome, idade, estadoCivil, endereco, telefone, salario);
		this.nrSrt = nrSrt;
		this.linguaInglesa = linguaInglesa;
	}

	public int getNrSrt() {
		return nrSrt;
	}

	public void setNrSrt(int nrSrt) {
		this.nrSrt = nrSrt;
	}

	public boolean isLinguaInglesa() {
		return linguaInglesa;
	}

	public void setLinguaInglesa(boolean linguaInglesa) {
		this.linguaInglesa = linguaInglesa;
	}
	
	public void atenderTelefone() {
		System.out.println("Atendendo o telefone...");
	}
}
