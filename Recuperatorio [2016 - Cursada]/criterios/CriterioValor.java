package criterios;

import composite.Ladrillo;

public class CriterioValor extends Criterio{
	
	private Object valor;
	
	public CriterioValor(String atributo,Object v) {
		super(atributo);
		this.valor=v;
	}

	@Override
	public boolean cumpleCriterio(Ladrillo l) {
		Object o = l.getAtributo(this.getAtributo());
		if (o != null) {
			return (o.equals(this.valor));
		}
		return false;
	}



}
