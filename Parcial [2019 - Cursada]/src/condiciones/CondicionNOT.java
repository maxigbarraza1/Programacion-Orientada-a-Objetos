package condiciones;

import composite.Envio;

public class CondicionNOT extends Condicion{

	private Condicion condicion;
	
	public CondicionNOT (Condicion a) {
		this.condicion=a;
	}
	
	@Override
	public boolean cumple(Envio e) {
		return !(this.condicion.cumple(e));
	}
	

}
