package main;

import composite.Pieza;
import composite.Ladrillo;

import java.util.ArrayList;
import java.util.HashMap;

import calculadora.Calculo;
import calculadora.CalculoCantidad;
import calculadora.CalculoMarca;
import calculadora.CalculoPrecio;
import composite.Combo;

public class Principal {
	
	public static void main(String[] args) {
		
		//Atributos
		Atributo atributos1 = new Atributo();
		atributos1.addAtributo("marca", "NIKE");
		atributos1.addAtributo("cantidad", 10);
		atributos1.addAtributo("precio", 5.0);
		
		Atributo atributos2 = new Atributo();
		atributos2.addAtributo("marca", "Adidas");
		atributos2.addAtributo("cantidad", 3);
		atributos2.addAtributo("precio", 9.0);
		
		//Piezas
		Pieza pieza1 = new Pieza(atributos1);
		Pieza pieza2 = new Pieza(atributos2);
		
		//Calculador
		CalculoCantidad cantidad = new CalculoCantidad();
		CalculoMarca marca = new CalculoMarca(0);
		CalculoPrecio precio = new CalculoPrecio();

		HashMap<String,Calculo> calc = new HashMap<String,Calculo>();
		calc.put("cantidad", cantidad);
		calc.put("marca", marca);
		calc.put("precio", precio);
		
		//Combo
		ArrayList<Ladrillo> lista = new ArrayList<Ladrillo>();
		lista.add(pieza1);
		lista.add(pieza2);
		
		Combo combo = new Combo(lista, calc);
		
		System.out.println("Precio: " +combo.getAtributo("precio"));		//precio = 14.0
		System.out.println("Marca: " +combo.getAtributo("marca"));			//marca = Adidas
		System.out.println("Cantidad: " +combo.getAtributo("cantidad"));	//cantidad = 13
		
		
		

	}

}
