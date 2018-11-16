package simetrica;

public class Nodo {

	private int nroNodo;
	private int grado = 0;
	private int color;

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getNroNodo() {
		return nroNodo;
	}

	public void setNroNodo(int nroNodo) {
		this.nroNodo = nroNodo;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public Nodo(int nodo) {
		this.setNroNodo(nodo);
	}

	public Nodo(int nodo, int color) {
		this.setNroNodo(nodo);
		this.color = color;
	}
	

	public void incrementarGrado() {
		this.grado++;
	}
	
}
