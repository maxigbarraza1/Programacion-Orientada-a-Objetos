package objetos;

public class Animal {
	
	private double peso;
	private int altura;
	private int ancho;
	private int largo;
	private String habitad;
	private boolean peligroso;
	
	public Animal (double peso,int altura, int ancho, int largo, String habitad, boolean peligroso) {
		this.setPeso(peso);
		this.setAltura(altura);
		this.setAncho(ancho);
		this.setLargo(largo);
		this.setHabitad(habitad);
		this.setPeligroso(peligroso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public String getHabitad() {
		return habitad;
	}

	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}

	public boolean isPeligroso() {
		return peligroso;
	}

	public void setPeligroso(boolean peligroso) {
		this.peligroso = peligroso;
	}
	
	public double getDimension() {
		return (getAltura()*getAncho()*getLargo());
	}

}
