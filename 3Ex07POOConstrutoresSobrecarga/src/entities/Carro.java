package entities;

public class Carro {
	String fabricante;
	String modelo;
	int ano;
	String cor;
	int nrPortas;
	
	
	public Carro() {
		super();
	}


	public Carro(String fabricante, String modelo, int ano, String cor, int nrPortas) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.nrPortas = nrPortas;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public int getNrPortas() {
		return nrPortas;
	}


	public void setNrPortas(int nrPortas) {
		this.nrPortas = nrPortas;
	}


	@Override
	public String toString() {
		return "Fabricante=" + fabricante +"\n"
				+ "Modelo=" + modelo +"\n"
				+ "Ano=" + ano +"\n"
				+ "Cor=" + cor +"\n"
				+ "NrPortas=" + nrPortas +"\n";
	}
	
	
	
	
	
	
	
}
