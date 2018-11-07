package entities;

public class Curso {

	private String Treino;
	private int cargaHoraria;
	
	
	public Curso() {
	}

	public Curso(String treino, int cargaHoraria) {
		Treino = treino;
		this.cargaHoraria = cargaHoraria;
	}

	public String getTreino() {
		return Treino;
	}

	public void setTreino(String treino) {
		Treino = treino;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	

	@Override
	public String toString() {
		return  "Escola: "+Vendavel.ESCOLA+"\n"
				+"Curso: "+getTreino()+"\n"
				+"Carga Horaria: "+getCargaHoraria()
				;
	}
	
	
}
