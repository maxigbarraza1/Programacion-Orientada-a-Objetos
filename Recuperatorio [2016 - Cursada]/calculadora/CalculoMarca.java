package calculadora;

import java.util.ArrayList;

import composite.Ladrillo;

public class CalculoMarca extends Calculo {
	
	private int posicion;
	private String c= "marca";

	public CalculoMarca(int p) {
		super();
		this.posicion=p;
	}

	@Override
	public Object calcular(ArrayList<Ladrillo> list) {
		if (!list.isEmpty()) {
			return (String)(list.get(posicion).getAtributo(c));
		}
		return ("No tiene marca");
	}

}
