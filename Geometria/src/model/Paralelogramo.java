package model;

public class Paralelogramo extends Quadrilatero{

	public Paralelogramo() {
		super();
	}

	@Override
	public float calcArea() {
		return getBase() * getAltura();
	}
	
	@Override
	public String toString() {
		return "A área do paralelogramo é igual a: " + calcArea() + " e o seu perímetro é igual a: " + calcPerimetro();
	}

}
