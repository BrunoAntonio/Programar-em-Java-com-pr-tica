package entities;

public class Cao {

	private String nome;
	private String raca;
	private int idade;
	
	
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "nome: " + getNome() +"\n" 
			+ "ra�a: " + getRaca() +"\n"
			+ "idade: " + getIdade()+" anos" ;
	}
	
	
	
}
