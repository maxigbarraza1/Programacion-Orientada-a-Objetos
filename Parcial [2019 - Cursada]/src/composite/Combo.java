package composite;

import java.util.ArrayList;

import condiciones.Condicion;

public class Combo extends Envio {
	
	private ArrayList<Envio> lista_envios;
	
	public Combo (int cod) {
		super(cod);
		lista_envios = new ArrayList<Envio>();
	}

	@Override
	public float getPeso() {
		float retorno=0;
		for (Envio e : lista_envios) {
			retorno+= e.getPeso();
		}
		return retorno;
	}

	@Override
	public String getEmisor() {
		if (lista_envios.isEmpty())
			return null;
		else
			return (lista_envios.get(0).getEmisor());
	}

	@Override
	public String getReceptor() {
		if (lista_envios.isEmpty())
			return null;
		else
			return (lista_envios.get(0).getReceptor());
	}

	@Override
	public String getDestino() {
		if (lista_envios.isEmpty())
			return null;
		else
			return (lista_envios.get(0).getDestino());
	}

	@Override
	public ArrayList<Simple> getEnvios(Condicion c) {
		ArrayList<Simple> retorno = new ArrayList<Simple>();
		for (Envio e : lista_envios) {

		}
		return null;
	}

	@Override
	public ArrayList<Envio> getCopia(Condicion c) {
		if (c.cumple(this)) {
			ArrayList<Envio> retorno = new ArrayList<Envio>();
			for (Envio e : lista_envios) {
				if (e.getCopia(c)!=null) {
					retorno.addAll(e.getCopia(c));
				}
			}
			if (!retorno.isEmpty())
				return retorno;
		}
		return null;
	}

	@Override
	public void setTracking(int tracking) {
		for (Envio e : lista_envios) {
			e.setTracking(tracking);
		}
	}
	
	public void addEnvio (Envio e) {
		e.setTracking(this.tracking);
		lista_envios.add(e);
	}

}
