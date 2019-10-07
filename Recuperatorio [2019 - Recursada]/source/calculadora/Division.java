package calculadora;

import composite.Elemento;

public class Division extends Calculo{

	public Division(Elemento a, Elemento b) {
		super(a, b);
	}

	@Override
	public double calcular() {
		if (this.getB().getValor() == 0) {
			return super.error;
		}
		else {
			return (this.getA().getValor() / this.getB().getValor());
		}
	}

	@Override
	public double inverso() {
		Producto aux = new Producto(this.getA(),this.getB());
		return aux.calcular();
	}
}
