package composite;

import java.util.ArrayList;

import objetos.Animal;

public abstract class Elemento {
	
	public abstract ArrayList<Jaula> getHabitables(Animal a);
	public abstract boolean puedeHabitar(Animal a);
	public abstract int getCantidadAnimales();
	public abstract double getM3();
	public abstract double getM3Libres();
	public abstract double getM3Ocupados();

}
