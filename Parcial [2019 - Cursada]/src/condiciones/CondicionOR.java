package condiciones;

import composite.Envio;

public class CondicionOR extends Condicion{
	
	
	private Condicion condicion1;
	private Condicion condicion2;
	
	public CondicionOR (Condicion a, Condicion b) {
		condicion1=a;
		condicion2=b;
	}

	@Override
	public boolean cumple(Envio e) {
		return (condicion1.cumple(e) || condicion2.cumple(e));
	}

}
