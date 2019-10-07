package composite;

import java.util.ArrayList;

import condiciones.Condicion;
import objetos.Animal;

public class Jaula extends Elemento{
	
	private double dimension;
	private String habitad;
	private boolean seguridad;
	private Animal animal;
	private Condicion condicion;
	
	public Jaula (double dimension, String habitad, boolean seguridad, Animal animal, Condicion condicion) {
		this.setDimension(dimension);
		this.setHabitad(habitad);
		this.setSeguridad(seguridad);
		this.setAnimal(animal);
		this.setCondicion(condicion);
	}

	public double getDimension() {
		return dimension;
	}

	public void setDimension(double dimension) {
		this.dimension = dimension;
	}

	public String getHabitad() {
		return habitad;
	}

	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}

	public boolean isSeguridad() {
		return seguridad;
	}

	public void setSeguridad(boolean seguridad) {
		this.seguridad = seguridad;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Condicion getCondicion() {
		return condicion;
	}

	public void setCondicion(Condicion condicion) {
		this.condicion = condicion;
	}
	
	public boolean jaulaVacia() {
		if (getAnimal()==null)
			return true;
		return false;
	}
	
	@Override
	public ArrayList<Jaula> getHabitables(Animal a){
		ArrayList<Jaula> retorno = new ArrayList<Jaula>();
		if (this.puedeHabitar(a))
			retorno.add(this);
		
		if (retorno.size()>0)
			return retorno;
		return null;
	}
	
//		--CONDICIONES ESTATICAS--
	
//	public boolean condicionEspacio(Animal a) {
//		if (this.getDimension() >= a.getDimension())
//			return true;
//		else
//			return false;
//	}
//	
//	public boolean condicionHabitad(Animal a) {
//		if (this.getHabitad().equals(a.getHabitad()) )
//			return true;
//		else
//			return false;
//	}
//	
//	public boolean condicionSeguridad(Animal a) {
//		if ( this.isSeguridad() == a.isPeligroso() )
//			return true;
//		else
//			return false;
//	}
	
	
// 		--CONDICIONES DINAMICAS--
	
	public boolean puedeHabitar(Animal a) {
		return this.condicion.cumple(a);
	}
	
// 

	@Override
	public int getCantidadAnimales() {
		if (jaulaVacia())
			return 0;
		else
			return 1;
	}

	@Override
	public double getM3() {
		return getDimension();
	}

	@Override
	public double getM3Libres() {
		if (jaulaVacia())
			return getDimension();
		else
			return 0;
	}

	@Override
	public double getM3Ocupados() {
		if (!jaulaVacia())
			return getDimension();
		else
			return 0;
	}
	
}
