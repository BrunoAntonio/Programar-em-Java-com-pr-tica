package entities;

public class Redes extends Curso implements Vendavel{

	public String sistemaOperativo;

	public Redes() {
		super();
	}

	public Redes(String treino, int cargaHoraria, String sistemaOperativo) {
		super(treino, cargaHoraria);
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	
	@Override
	
	public double preco(int numb) {
		if (numb == 1) {
			return 620.0;
		} else {
			return 1190.00;
		}
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+"\n"
				+"Sistema Operativo: "+getSistemaOperativo()+"\n"
				;		
	}

}


