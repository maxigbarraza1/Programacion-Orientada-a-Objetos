package condiciones;

import composite.Envio;

public class CondicionDestino extends Condicion{

	private String destino;
	
	public CondicionDestino (String d) {
		this.destino=d;
	}

	@Override
	public boolean cumple(Envio e) {
		return (e.getDestino().equals(this.destino));
	}
}
