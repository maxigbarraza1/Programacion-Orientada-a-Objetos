package criterios;

import composite.Ladrillo;

public class CriterioNOT extends Criterio {
	
	private Criterio c;

	public CriterioNOT(String atributo,Criterio c) {
		super(atributo);
		this.c=c;
	}

	@Override
	public boolean cumpleCriterio(Ladrillo l) {
		return !(this.c.cumpleCriterio(l));
	}

}
