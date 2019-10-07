package calculadora;

import composite.Elemento;

public abstract class Calculo {
	
	private Elemento A;
	private Elemento B;
	protected int error = -23;

	//Constructor
	public Calculo(Elemento a,Elemento b) {
		this.setA(a);
		this.setB(b);
	}
	
	//Setters & Getters
	public Elemento getA() {
		return A;
	}

	public void setA(Elemento a) {
		A = a;
	}

	public Elemento getB() {
		return B;
	}

	public void setB(Elemento b) {
		B = b;
	}
	
	public void changeError(int v) {
		this.error=v;
	}
	//Abstractos
	public abstract double calcular();
	public abstract double inverso();

}
