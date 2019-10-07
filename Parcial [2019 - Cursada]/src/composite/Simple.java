package composite;

import java.util.ArrayList;

import condiciones.Condicion;

public class Simple extends Envio{
	
	private String emisor;
	private String origen;
	private String receptor;
	private String destino;
	public boolean retiro_sucursal;
	private float peso;
	
	public Simple (int track,String emisor,String receptor,String origen, String destino,boolean retiro, float peso) {
		super(track);
		setEmisor(emisor);
		setReceptor(receptor);
		setOrigen(origen);
		setDestino(destino);
		this.retiro_sucursal=retiro;
		setPeso(peso);
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getReceptor() {
		return receptor;
	}

	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public boolean loRetira () {
		return this.retiro_sucursal;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public ArrayList<Simple> getEnvios(Condicion c) {
		ArrayList<Simple> retorno = new ArrayList<Simple>();
		if (c.cumple(this)) {
			retorno.add(this);
			return retorno;
		}
		return null;
	}

	@Override
	public ArrayList<Envio> getCopia(Condicion c) {
		if (c.cumple(this)) {
			ArrayList<Envio> retorno = new ArrayList<Envio>();
			Simple copia = this;
			retorno.add(copia);
			return retorno;
		}
		return null;
	}

	@Override
	public void setTracking(int tracking) {
		this.tracking = tracking;
	}
	

}
