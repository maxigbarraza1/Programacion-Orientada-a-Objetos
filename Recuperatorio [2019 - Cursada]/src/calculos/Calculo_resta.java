package calculos;

import composite.Elemento;

public class Calculo_resta extends Calculo{
	private Elemento e1;
	private Elemento e2;
	public Calculo_resta(Elemento e1, Elemento e2) {
		super();
		this.e1=e1;
		this.e2=e2;
		super.setOperador("-");
		// TODO Auto-generated constructor stub
	}

	@Override
	public double get_calculo() {
		return e1.get_valor()-e2.get_valor();
	}
	public Calculo getOpuesto() {
		Calculo suma= new Calculo_suma(this.e1,this.e2);
		return suma;
	}
}
