package criterios;

import composite.Ladrillo;

public abstract class Criterio {
	
	private String atributo;

	public Criterio(String atributo) {
		this.atributo=atributo;
	}
	
	public String getAtributo() {
		return this.atributo;
	}
	
	public abstract boolean cumpleCriterio(Ladrillo l);

}
