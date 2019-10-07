package composite;

import java.util.ArrayList;

public class Valor extends Elemento{
	
	private double numero;

	public Valor(double valor) {
		this.numero=valor;
	}
	
	@Override
	public double getValor() {
		return this.numero;
	}

	@Override
	public ArrayList<Double> getValores() {
		ArrayList<Double> aux = new ArrayList<Double>();
		aux.add(this.numero);
		return aux;
	}
	
	@Override
	public String toString() {
		return (""+this.numero);
	}

	@Override
	public ArrayList<String> getOperadores() {
		ArrayList<String> aux = new ArrayList<String>();
		return aux;
	}

	@Override
	public Elemento normalizar(int factor) {
		Valor aux = new Valor(this.numero/factor);
		return aux;
	}

	@Override
	public Elemento getCopia() {
		return this.normalizar(1);
	}
}
