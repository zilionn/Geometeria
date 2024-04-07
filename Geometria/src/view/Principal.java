package view;

import model.Paralelogramo;
import model.Trapezio;

public class Principal {

	public static void main(String[] args) {
		Trapezio t = new Trapezio();
		
		t.setAltura(30);
		t.setBase(50);
		t.setBaseMenor(60);
		
		System.out.println(t.toString());
		
		System.out.println("----------------------------");
		
		Paralelogramo p = new Paralelogramo();
		
		p.setAltura(60);
		p.setBase(25);
		
		System.out.println(p.toString());
		
		
	}

}
