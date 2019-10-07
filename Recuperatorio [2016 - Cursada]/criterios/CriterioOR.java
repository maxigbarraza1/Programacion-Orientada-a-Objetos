package criterios;

import composite.Ladrillo;

public class CriterioOR extends Criterio {
	
	private Criterio criterio1;
	private Criterio criterio2;

	public CriterioOR(String atributo, Criterio c1, Criterio c2) {
		super(atributo);
		this.criterio1=c1;
		this.criterio2=c2;
	}

	public Criterio getCriterio1() {
		return criterio1;
	}

	public void setCriterio1(Criterio criterio1) {
		this.criterio1 = criterio1;
	}

	public Criterio getCriterio2() {
		return criterio2;
	}

	public void setCriterio2(Criterio criterio2) {
		this.criterio2 = criterio2;
	}

	@Override
	public boolean cumpleCriterio(Ladrillo l) {
		return (this.criterio1.cumpleCriterio(l) || this.criterio2.cumpleCriterio(l));
	}

}
