package model;

public abstract class Quadrilatero {
	
	private float base;
    private float altura;
    
	public Quadrilatero() {
		super();
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float calcPerimetro() {
		float peri = 2 * (base + altura);
		
		return peri;
	}
	
	public abstract float calcArea();
	
}
