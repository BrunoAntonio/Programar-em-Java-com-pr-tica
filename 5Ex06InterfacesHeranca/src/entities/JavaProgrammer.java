package entities;

public class JavaProgrammer extends Curso implements Vendavel {

	private double versao;
	
	public JavaProgrammer() {
		super();
	}

	public JavaProgrammer(String treino, int cargaHoraria, double versao) {
		super(treino, cargaHoraria);
		this.versao = versao;
	}


	public double getVersao() {
		return versao;
	}

	public void setVersao(double versao) {
		this.versao = versao;
	}

	@Override
	public double preco(int numb) {
		if (numb == 1) {
			return 780.0;
		} else {
			return 1320.00;
		}
	}

	@Override
	public String toString() {
		return super.toString()+"\n"
				+"Versão: "+getVersao()+"\n";
				
	}
	
	
	

}


