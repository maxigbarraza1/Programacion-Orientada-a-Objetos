package composite;

import java.util.ArrayList;

import condiciones.Condicion;

public abstract class Envio {
	
	protected int tracking;
	
	public Envio (int cod) {
		this.setTracking(cod);
	}

	public int getTracking() {
		return tracking;
	}

	public abstract void setTracking(int tracking);
	
	public abstract float getPeso();
	public abstract String getEmisor();
	public abstract String getReceptor();
	public abstract String getDestino();
	
	public abstract ArrayList<Simple> getEnvios(Condicion c);
	
	public abstract ArrayList<Envio> getCopia(Condicion c);
}
