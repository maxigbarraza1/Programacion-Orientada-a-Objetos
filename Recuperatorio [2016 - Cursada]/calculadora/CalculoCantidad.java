package calculadora;

import java.util.ArrayList;
import composite.Ladrillo;

public class CalculoCantidad extends Calculo{
	
	private String c= "cantidad";

	public CalculoCantidad() {
		super();
	}

	@Override
	public Object calcular(ArrayList<Ladrillo> list) {
		int resultado=0;
		for (int i=0;i<list.size();i++) {
			Object o = list.get(i).getAtributo(this.c);
			resultado+=((int)o);
		}
		return resultado;
	}
}
