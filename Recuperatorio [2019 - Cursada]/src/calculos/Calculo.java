package calculos;

public abstract class Calculo {
	private String operador;
	public Calculo() {
		this.operador="";
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	public abstract double get_calculo();
	
	public abstract Calculo getOpuesto();

	
}
