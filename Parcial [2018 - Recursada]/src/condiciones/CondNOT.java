package condiciones;

import objetos.Animal;

public class CondNOT extends Condicion{
	
	private Condicion condicion;
	
	public CondNOT (Condicion c) {
		this.condicion=c;
	}

	@Override
	public boolean cumple(Animal a) {
		return !this.condicion.cumple(a);
	}
	
	

}
