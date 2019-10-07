package condiciones;

import objetos.Animal;

public class CondAND extends Condicion{
	
	private Condicion condicion1;
	private Condicion condicion2;
	
	public CondAND (Condicion a, Condicion b) {
		this.condicion1=a;
		this.condicion2=b;
	}

	@Override
	public boolean cumple(Animal a) {
		return (condicion1.cumple(a) && condicion2.cumple(a));
	}

}
