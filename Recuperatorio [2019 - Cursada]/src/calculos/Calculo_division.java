package calculos;

import composite.Elemento;
import errores.Error;
import errores.Error_cero;

public class Calculo_division extends Calculo{
	private Elemento e1;
	private Elemento e2;
	private Error error;
	public Calculo_division(Elemento e1, Elemento e2, double error) {
		super();
		this.e1=e1;
		this.e2=e2;
		super.setOperador("/");
		this.error= new Error_cero(error);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double get_calculo() {
		if (error.cumple_error(e2))
				return error.getValor();
		return e1.get_valor()-e2.get_valor();
	}
	public Calculo getOpuesto() {
		Calculo suma= new Calculo_suma(this.e1,this.e2);
		return suma;
	}
}

