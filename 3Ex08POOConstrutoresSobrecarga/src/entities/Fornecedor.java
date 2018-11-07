package entities;

public class Fornecedor {
	String nome;
	String telefone;
	String endereco;
	String tipoProduto;
	
	public Fornecedor(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public Fornecedor(String nome, String telefone, String tipoProduto) {
		this.nome = nome;
		this.telefone = telefone;
		this.tipoProduto = tipoProduto;
	}

	public Fornecedor(String nome, String telefone, String endereco, String tipoProduto) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.tipoProduto = tipoProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	@Override
	public String toString() {
		return "Nome=" + nome + "\n"
				+ "Telefone=" + telefone + "\n"
				+ "Endereco=" + endereco  + "\n"
				+ "TipoProduto="+ tipoProduto + "\n";
	}
	
	

	
	
	
	
	
	
	
}
