package entities;

public class Triangulo extends Poligono {

	private double altura;
	private double base;
	
	public Triangulo() {
		super();
	}
	
	public Triangulo(double altura, double base) {
		super();
		this.altura = altura;
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public void calculoArea() {
		double resultado=altura*base/2;
		setArea(resultado);
	}


	@Override
	public String toString() {
		return "Area: "+String.format("%.2f",getArea());
	}
	
	
}
