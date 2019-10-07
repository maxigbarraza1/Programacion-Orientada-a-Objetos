package composite;

import java.util.ArrayList;
import criterios.Criterio;
import main.Atributo;

public abstract class Ladrillo {
	
	protected Atributo atributos;

	public Ladrillo() {
		this.atributos= new Atributo();
	}
	
	public abstract ArrayList<Ladrillo> listarElementos(Criterio c);
	public abstract ArrayList<Ladrillo> copiaRestringida(Criterio c);
	public abstract Object getAtributo(String k);

}
