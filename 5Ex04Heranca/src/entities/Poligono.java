package entities;

public abstract class Poligono {

	private double area;
	
	public Poligono() {
	}
	
	public Poligono(double area) {
		super();
		this.area = area;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public abstract void calculoArea();
	
	
	
	
}
