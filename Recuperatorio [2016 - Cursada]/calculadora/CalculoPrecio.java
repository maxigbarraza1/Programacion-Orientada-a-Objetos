package calculadora;

import java.util.ArrayList;

import composite.Ladrillo;

public class CalculoPrecio extends Calculo{
	
	private String c = "precio";

	public CalculoPrecio() {
		super();
	}

	@Override
	public Object calcular(ArrayList<Ladrillo> list) {
		double resultado=0;
		for (int i=0;i<list.size();i++) {
			Object o = list.get(i).getAtributo(this.c);
			resultado+=((double)o);
		}
		return resultado;
	}

}
