package composite;

import java.util.ArrayList;

import calculadora.Calculo;

public class Expresion extends Elemento{
	
	private Elemento valorA;
	private Elemento valorB;
	private String operador;
	private Calculo calculo;

	//Constructor
	public Expresion(Elemento a,Elemento b, String op,Calculo c) {
		this.valorA=a;
		this.valorB=b;
		this.operador=op;
		this.calculo=c;
	}
	
	//Setters & Getters
	public Elemento getValorA() {
		return valorA;
	}
	
	public void setValorA(Elemento valorA) {
		this.valorA = valorA;
	}
	
	public Elemento getValorB() {
		return valorB;
	}
	
	public void setValorB(Elemento valorB) {
		this.valorB = valorB;
	}
	
	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}
	
	public Calculo getCalculo() {
		return calculo;
	}

	public void setCalculo(Calculo calculo) {
		this.calculo = calculo;
	}
	
	//Metodos 
	@Override
	public double getValor() {
		return calculo.calcular();
	}

	@Override
	public ArrayList<Double> getValores() {
		ArrayList<Double> aux = new ArrayList<Double>();
		aux.addAll(this.valorA.getValores());
		aux.addAll(this.valorB.getValores());
		if (aux.size()>0)
			return aux;
		return null;
	}

	public ArrayList<String> getOperadores(){
		ArrayList<String> aux = new ArrayList<String>();
		aux.add(this.operador);
		aux.addAll(this.valorA.getOperadores());
		aux.addAll(this.valorB.getOperadores());
		if (aux.size()>0)
			return aux;
		return null;
	}
	
	@Override
	public String toString() {
		return ("("+this.valorA.toString() +" "+ this.operador +" "+this.valorB.toString() + ")");
	}

	@Override
	public Elemento normalizar(int factor) {
		Expresion aux = new Expresion(this.getValorA().normalizar(factor),this.getValorB().normalizar(factor),this.operador,this.calculo);
		return aux;
	}

	@Override
	public Elemento getCopia() {
		return this.normalizar(1);
	}
	

}
