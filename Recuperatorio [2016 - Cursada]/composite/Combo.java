package composite;

import java.util.ArrayList;
import java.util.HashMap;
import criterios.Criterio;
import calculadora.Calculo;

public class Combo extends Ladrillo {
	
	private ArrayList<Ladrillo> combos;
	private HashMap<String,Calculo> calculador;
	
	//Constructor
	public Combo (ArrayList<Ladrillo> comb, HashMap<String,Calculo> calc) {
		this.combos=comb;
		this.calculador=calc;
	}
	
	//Setters & Getters
	public Calculo getCalculo(String k) {
		return (calculador.get(k));
	}
	
	//Metodos
	@Override
	public ArrayList<Ladrillo> listarElementos(Criterio c) {
		ArrayList<Ladrillo> aux = new ArrayList<Ladrillo>();
		for (Ladrillo l : this.combos) {
			aux.addAll(l.listarElementos(c));
		}
		if (aux.isEmpty()) {
			return null;
		}
		return aux;
	}

	@Override
	public ArrayList<Ladrillo> copiaRestringida(Criterio c) {
		if (!c.cumpleCriterio(this)) {
			ArrayList<Ladrillo> aux = new ArrayList<Ladrillo>();
			for (Ladrillo l : this.combos) {
				if (l.copiaRestringida(c) != null) {
					aux.addAll(l.copiaRestringida(c));
				}
			}
			if (!aux.isEmpty()) {
				return aux;
			}
			else {
				return null;
			}
		}
		return null;
	}

	@Override
	public Object getAtributo(String k) {
		if (!combos.isEmpty()) {
		return this.calculador.get(k).calcular(this.combos);
		}
		return null;
	}
	

}
