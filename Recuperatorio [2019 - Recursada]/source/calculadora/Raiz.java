package calculadora;

import composite.Elemento;
import composite.Valor;

public class Raiz extends Calculo {

	public Raiz(Elemento a, Elemento b) {
		super(a, b);
	}

	@Override
	public double calcular() {
		if (this.getA().getValor()<0) {
			return super.error;
		}
		else {
			Valor numerador = new Valor(1);
			Division b = new Division(numerador,this.getB());
			return (Math.pow(this.getA().getValor(), b.calcular()));
		}
	}

	@Override
	public double inverso() {
		Potencia aux = new Potencia(this.getA(),this.getB());
		return aux.calcular();
	}

}
