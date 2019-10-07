package errores;

import composite.Elemento;

public class Error_negativo extends Error{
	public Error_negativo(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	public boolean cumple_error(Elemento e1) {
		if (e1.get_valor() < 0)
			return true;
		return false;
	}
}
