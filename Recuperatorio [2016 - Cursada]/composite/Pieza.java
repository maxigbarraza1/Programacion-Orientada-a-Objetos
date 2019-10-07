package composite;

import java.util.ArrayList;

import criterios.Criterio;
import main.Atributo;

public class Pieza extends Ladrillo {

	public Pieza(Atributo a) {
		this.atributos=a;
	}

	@Override
	public ArrayList<Ladrillo> listarElementos(Criterio c) {
		if (c.cumpleCriterio(this)) {
			ArrayList<Ladrillo> aux = new ArrayList<Ladrillo>();
			aux.add(this);
			return aux;
		}
		return null;
	}

	@Override
	public ArrayList<Ladrillo> copiaRestringida(Criterio c) {
		ArrayList<Ladrillo> aux = new ArrayList<Ladrillo>();
		if (!c.cumpleCriterio(this)){
			Pieza p = new Pieza(this.atributos);
			aux.add(p);
			return aux;
		}
		return null;
	}

	@Override
	public Object getAtributo(String k) {
		return this.atributos.getValor(k);
	}


}
