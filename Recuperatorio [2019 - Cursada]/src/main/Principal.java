package main;

import calculos.Calculo;
import calculos.Calculo_division;
import calculos.Calculo_resta;
import calculos.Calculo_suma;
import composite.Elemento;
import composite.Expresion;
import composite.Numero;

public class Principal {
	public static void main (String [ ]args) {
		Elemento numero1= new Numero(3);
		Elemento numero2= new Numero(7);
		Elemento numero3= new Numero(6);
		Elemento numero4= new Numero(2);
		Elemento numero5= new Numero(0);
		Calculo suma= new Calculo_suma(numero1,numero2);
		Elemento operacion1= new Expresion(numero1,numero2,suma);
		Calculo resta= new Calculo_resta(operacion1,numero3);
		Elemento operacion2= new Expresion(operacion1,numero3,resta);
		Calculo division= new Calculo_division(operacion2,numero5,-23);
		Elemento operacion3= new Expresion(operacion2,numero5,division);
		// IMPRIME EXPRESION 
		operacion2.imprimir_expresion();
		System.out.println();
		
		// IMPRIME RESULTADO
		System.out.printf("Resultado = ");
		System.out.print(operacion2.get_valor());
		System.out.println();
		
		//IMPRIME LISTA DE OPERADORES
		System.out.printf("Operadores: ");
		for (String operador : operacion2.get_operadores()) {
			System.out.printf(operador, " ");
		}
		System.out.println();
		
		//NORMALIZA EXPRESION
		Elemento expresion = operacion2.normalizar(10);
		expresion.imprimir_expresion();
		System.out.println();
		
		//EXPRESION OPUESTA
		Elemento exp_opuesta=operacion2.get_expopuesta();
		exp_opuesta.imprimir_expresion();
		System.out.println();
		
		//ERROR EN DIVISION POR 0 -  DA -23
		operacion3.imprimir_expresion();
		System.out.printf(" Resultado = ");
		System.out.print(operacion3.get_valor());
		System.out.println();
		
	}
}
