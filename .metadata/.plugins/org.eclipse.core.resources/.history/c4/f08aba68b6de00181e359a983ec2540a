package entities;

public class Compra {

	private String nomeCliente;
	private double valorCompra;
	private double valorAPagar;
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		if (valorCompra>=1000) {
			this.valorCompra = valorCompra;
		} else {
			System.out.println("O valor mínimo de compra é $ 1000");
		}
	
	}
	public double getValorAPagar() {
		return valorAPagar;
	}
	public void setValorAPagar(double valorCompra) {
		if(valorCompra<=1000) {
			this.valorAPagar=valorCompra;
		}else if(valorCompra<=3000) {
			this.valorAPagar=valorCompra*0.95;
		}else {
			this.valorAPagar=valorCompra*0.90;
		}
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Nome do cliente: ");
		sb.append(getNomeCliente());
		
		return "Nome do cliente: " + getNomeCliente()+"\n" 
				+ "Valor da compra: " + String.format("%.2f%n",getValorCompra())
				+ "Valor a pagar: " + String.format("%.2f%n", getValorAPagar());
	}
	
	
	
	
}
