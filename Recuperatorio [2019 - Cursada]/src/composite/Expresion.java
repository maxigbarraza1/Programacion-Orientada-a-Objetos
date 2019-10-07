package composite;

import java.util.ArrayList;

import calculos.Calculo;

public class Expresion extends Elemento{
	private Elemento elem1;
	private Elemento elem2;
	private Calculo formula;
	public Expresion(Elemento e1, Elemento e2, Calculo formula) {
		this.elem1=e1;
		this.elem2=e2;
		this.formula=formula;
	}
	@Override
	public double get_valor() {
		return this.formula.get_calculo();
	}
	public ArrayList<Numero> get_numeros() {
		ArrayList<Numero> l=new ArrayList<Numero>();
		l.addAll(elem1.get_numeros());
		l.addAll(elem2.get_numeros());
		return l;
	}
	public ArrayList<String> get_operadores(){
		ArrayList<String> lista= new ArrayList<String>();
		lista.addAll(elem1.get_operadores());
		lista.add(formula.getOperador());
		lista.addAll(elem2.get_operadores());
		return lista;
	}
	public Elemento normalizar(double valor){
		Expresion e= new Expresion(elem1.normalizar(valor),elem2.normalizar(valor),this.formula);
		return e;
	}
	public void imprimir_expresion() {
		System.out.printf("(");
		elem1.imprimir_expresion();
		System.out.printf(" ");
		System.out.printf(formula.getOperador());
		System.out.printf(" ");
		elem2.imprimir_expresion();
		System.out.printf(")");
	}
	public Elemento get_expopuesta() {
		Expresion e= new Expresion(elem1.get_expopuesta(),elem2.get_expopuesta(),this.formula.getOpuesto());
		return e;
	}

}
