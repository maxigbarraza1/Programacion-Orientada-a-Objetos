package composite;

import java.util.ArrayList;

import objetos.Animal;

public class Sector extends Elemento {
	
	private ArrayList<Elemento> lista_jaulas;
	
	public Sector () {
		lista_jaulas = new ArrayList<Elemento>();
	}

	@Override
	public ArrayList<Jaula> getHabitables(Animal a) {
		ArrayList<Jaula> retorno = new ArrayList<Jaula>();
		for (Elemento j : lista_jaulas) {
			retorno.addAll(j.getHabitables(a));
		}
		if (retorno.size()==0)
			return null;
		return retorno;
	}

	@Override
	public boolean puedeHabitar(Animal a) {
		for (Elemento j : lista_jaulas) {
			if (j.puedeHabitar(a))
				return true;
		}
		return false;
	}

	@Override
	public int getCantidadAnimales() {
		int retorno=0;
		for (Elemento j : lista_jaulas) {
			retorno+=j.getCantidadAnimales();
		}
		return retorno;
	}

	@Override
	public double getM3() {
		double retorno=0;
		for (Elemento j : lista_jaulas) {
			retorno+= j.getM3();
		}
		return retorno;
	}

	@Override
	public double getM3Libres() {
		double retorno=0;
		for (Elemento j : lista_jaulas) {
			retorno+= j.getM3Libres();
		}
		return retorno;
	}

	@Override
	public double getM3Ocupados() {
		double retorno=0;
		for (Elemento j : lista_jaulas) {
			retorno+= j.getM3Ocupados();
		}
		return retorno;
	}
}
