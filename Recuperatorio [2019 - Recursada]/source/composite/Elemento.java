package composite;

import java.util.ArrayList;

public abstract class Elemento {

	
	public Elemento () {
		
	}
	
	public abstract double getValor();					//Obtiene el valor de la expresion
	public abstract ArrayList<Double> getValores();		//Obtiene la lista de valores de la expresion
	public abstract ArrayList<String> getOperadores();	//Obtiene la lista de operadores de la expresion
	public abstract String toString();					//Metodo que permite la facil impresion de la expresion
	public abstract Elemento normalizar(int factor);	//Metodo que normaliza la expresion por el factor dado
	public abstract Elemento getCopia();				//Metodo que permite obtener una copia de la expresion
}
