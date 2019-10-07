package calculos;

import composite.Elemento;

public class Calculo_suma extends Calculo {
	private Elemento e1;
	private Elemento e2;
	public Calculo_suma(Elemento e1, Elemento e2) {
		super();
		this.e1=e1;
		this.e2=e2;
		super.setOperador("+");
	}

	@Override
	public double get_calculo() {
		return e1.get_valor()+e2.get_valor();
	}

	@Override
	public Calculo getOpuesto() {
		Calculo resta= new Calculo_resta(this.e1,this.e2);
		return resta;
	}
	

}
