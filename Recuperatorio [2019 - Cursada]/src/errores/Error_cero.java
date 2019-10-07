package errores;

import composite.Elemento;

public class Error_cero extends Error{

	public Error_cero(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean cumple_error(Elemento e1) {
		if (e1.get_valor() == 0)
			return true;
		return false;
	}
	
}
