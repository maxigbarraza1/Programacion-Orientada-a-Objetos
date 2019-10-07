package condiciones;

import objetos.Animal;

public class CondHabitad extends Condicion{
	
	private String habitad;
	
	public CondHabitad(String n) {
		setHabitad(n);
	}

	public void setHabitad(String n) {
		this.habitad=n;
	}
	
	public String getHabitad() {
		return this.habitad;
	}
	
	@Override
	public boolean cumple(Animal a) {
		return (a.getHabitad().equals(getHabitad()));
	}
	
	

}
