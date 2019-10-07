package calculadora;

import composite.Elemento;

public class Potencia extends Calculo{
	
	public Potencia(Elemento a, Elemento b) {
		super(a, b);
	}

	@Override
	public double calcular() {
		return (Math.pow(this.getA().getValor(), this.getB().getValor()));
	}

	@Override
	public double inverso() {
		Raiz aux = new Raiz(this.getA(),this.getB());
		return aux.calcular();
	}

}
