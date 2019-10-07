package calculadora;

import composite.Elemento;

public class Resta extends Calculo{

	public Resta(Elemento a,Elemento b) {
		super(a, b);
	}

	@Override
	public double calcular() {
		return (this.getA().getValor() - this.getB().getValor());
	}

	@Override
	public double inverso() {
		Suma opuesto = new Suma(this.getA(),this.getB());
		return opuesto.calcular();
	}

}