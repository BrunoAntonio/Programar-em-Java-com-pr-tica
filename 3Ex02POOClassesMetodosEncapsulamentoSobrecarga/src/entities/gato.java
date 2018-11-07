package entities;

public class gato {

	private String nome;
	private String raca;
	private String alimentacao;
	private int idade;
	private boolean vacina;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		
		
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
		
		
	}
	public String getAlimentacao() {
		return alimentacao;
	}
	public void setAlimentacao(int idade) {
		if (idade<=2 ) {
			this.alimentacao="8 vezes ao dia";
		}else if (idade <8) {
			this.alimentacao="6 vezes ao dia";
		}else {
			this.alimentacao="3 vezes ao dia";
		}
		
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public boolean isVacina() {
		return vacina;
	}
	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}
	@Override
	public String toString() {
		return "nome: "+ getNome() +"\n"
				+ "raca: " + getRaca() +"\n"
				+ "idade: " + getIdade()+" anos" +"\n"
				+ "alimentacao: " + getAlimentacao()+"\n";
				
	}
	
	
	public String toString(boolean vacina) {
		if (vacina == true) {
			return getNome() +" está com a vacina em dia \n"
					+"\n";
		} else {
			return getNome() +" necessita vacinar \n"
					+"\n";
		}
				
	}

	
	
	
}
