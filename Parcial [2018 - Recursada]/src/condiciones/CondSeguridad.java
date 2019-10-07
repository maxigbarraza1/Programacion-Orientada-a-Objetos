package condiciones;

import objetos.Animal;

public class CondSeguridad extends Condicion{

	private boolean segura;
	
	public CondSeguridad (boolean s) {
		setSeguridad(s);
	}
	
	@Override
	public boolean cumple(Animal a) {
		if (a.isPeligroso() == isSegura() )
			return true;
		else
			return false;
	}

	public boolean isSegura() {
		return segura;
	}

	public void setSeguridad(boolean seguridad) {
		this.segura = seguridad;
	}

}
