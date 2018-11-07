package entities;

public class Quadrado extends Poligono {

	private double lado;

	public Quadrado() {
		super();
	}

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public void calculoArea() {
		double resultado=lado*lado;
		setArea(resultado);
	}
	
	@Override
	public String toString() {
		return "Area: "+String.format("%.2f",getArea());
	}
	
	
}
