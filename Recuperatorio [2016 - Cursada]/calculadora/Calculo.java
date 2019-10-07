package calculadora;

import java.util.ArrayList;

import composite.Ladrillo;

public abstract class Calculo {

	public Calculo( ) {
		
	}
	
	public abstract Object calcular(ArrayList<Ladrillo> l);

}
