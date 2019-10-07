package calculadora;

import composite.Elemento;

public class Suma extends Calculo{

	public Suma(Elemento a,Elemento b) {
		super(a, b);
	}

	@Override
	public double calcular() {
		return (this.getA().getValor() + this.getB().getValor());
	}

	@Override
	public double inverso() {
		Resta opuesto = new Resta(this.getA(),this.getB());
		return opuesto.calcular();
	}

}
