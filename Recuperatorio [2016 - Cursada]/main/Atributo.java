package main;
import java.util.HashMap;

public class Atributo {
	
	private HashMap<String,Object> atributos;

	public Atributo() {
		this.atributos= new HashMap<String,Object>();
	}
	
	public void addAtributo(String k, Object v) {
		this.atributos.put(k, v);
	}
	
	public Object getValor(String k) {
		return this.atributos.get(k);
	}
}
