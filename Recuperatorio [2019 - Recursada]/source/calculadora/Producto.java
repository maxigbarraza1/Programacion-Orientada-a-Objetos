package calculadora;

import composite.Elemento;

public class Producto extends Calculo{

	public Producto(Elemento a, Elemento b) {
		super(a, b);
	}

	@Override
	public double calcular() {
		return (this.getA().getValor() * this.getB().getValor());
	}

	@Override
	public double inverso() {
		Division aux = new Division(this.getA(),this.getB());
		return aux.calcular();
	}
}
