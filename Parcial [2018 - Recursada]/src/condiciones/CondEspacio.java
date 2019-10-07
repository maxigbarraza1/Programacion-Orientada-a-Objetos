package condiciones;

import objetos.Animal;

public class CondEspacio extends Condicion{
	
	private double volumen;
	
	public CondEspacio (double volum) {
		setVolumen(volum);
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	@Override
	public boolean cumple(Animal a) {
		if (a.getDimension() <= getVolumen())
			return true;
		else
			return false;
	}

}
