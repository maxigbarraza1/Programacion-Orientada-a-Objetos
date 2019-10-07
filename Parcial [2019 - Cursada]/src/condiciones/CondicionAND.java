package condiciones;

import composite.Envio;

public class CondicionAND extends Condicion{
	
	private Condicion condicion1;
	private Condicion condicion2;
	
	public CondicionAND (Condicion a, Condicion b) {
		condicion1=a;
		condicion2=b;
	}

	@Override
	public boolean cumple(Envio e) {
		return (condicion1.cumple(e) && condicion2.cumple(e));
	}

}
