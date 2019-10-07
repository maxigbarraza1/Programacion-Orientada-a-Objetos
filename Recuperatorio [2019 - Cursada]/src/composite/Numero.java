package composite;

import java.util.ArrayList;

public class Numero extends Elemento {
	private double numero;
	public Numero(double numero) {
		super();
		this.numero=numero;
	}
	@Override
	public double get_valor() {
		return this.numero;
	}
	@Override
	public ArrayList<Numero> get_numeros() {
		ArrayList<Numero> l=new ArrayList<Numero>();
		l.add(this);
		return l;
	}
	public ArrayList<String> get_operadores(){
		ArrayList<String> lista= new ArrayList<String>();
		return lista;
	}
	public Elemento normalizar(double valor) {
		Numero num= new Numero(this.numero/valor);
		return num;
	}
	public Elemento get_expopuesta() {
		Elemento numero= new Numero(this.numero);
		return numero;
	}
	public void imprimir_expresion() {
		System.out.print(this.numero);
	}
	
}
