package entities;

public class Endereco {

	String logradoro;
	int nr;
	String bairro;
	
	public Endereco() {
	}

	public Endereco(String logradoro, int nr, String bairro) {
		this.logradoro = logradoro;
		this.nr = nr;
		this.bairro = bairro;
	}

	public String getLogradoro() {
		return logradoro;
	}

	public void setLogradoro(String logradoro) {
		this.logradoro = logradoro;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public void setEndereco(String logradoro, int nr, String bairro) {
		setLogradoro(logradoro);
		setNr(nr);
		setBairro(bairro);
	}

	@Override
	public String toString() {
		return "Logradoro:"+ getLogradoro()+" - "
				+ "Nr:" + getNr() +" - "
				+ "Bairro:" + getBairro();
	}
	
	
	
}
