package errores;

import composite.Elemento;

public abstract class Error {
	private double valor;
	public Error(double valor) {
		this.valor=valor;
	}
	public abstract boolean cumple_error(Elemento e1);
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
