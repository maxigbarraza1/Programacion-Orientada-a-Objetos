package composite;

import java.util.ArrayList;


public abstract class Elemento {
	public Elemento() {};
	public abstract double get_valor();
	public abstract ArrayList<Numero> get_numeros();
	public abstract ArrayList<String> get_operadores();
	public abstract Elemento normalizar(double valor);
	public abstract void imprimir_expresion();
	public abstract Elemento get_expopuesta();

}
