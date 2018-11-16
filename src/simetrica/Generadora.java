package simetrica;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class Generadora {

	private int cantNodos;
	private int gradoMaximo, gradoMinimo, cantAristas;
	private float porAdy;
	protected MatrizSimetrica m;

	// Constructor
	public Generadora(int cantNodos) {
		super();
		this.cantNodos = cantNodos;
		this.m = new MatrizSimetrica(this.cantNodos);

	}

	// Metodos

	public void calcularGrados() throws Exception {
		int[] grados = new int[this.cantNodos];
		for (int i = 0; i < this.cantNodos; i++) {
			for (int j = 0; j < this.cantNodos; j++) {
				if (m.getFilaColumna(i, j) == true) {
					grados[i]++;
				}
			}
		}
		int max = 0;
		int min = 0;

		for (int i = 0; i < grados.length; i++) {
			if (i == 0) {
				max = grados[i];
				min = grados[i];
			} else {
				if (grados[i] > max) {
					max = grados[i];
				}
				if (grados[i] < min) {
					min = grados[i];
				}

			}

		}
		this.gradoMaximo = max;
		this.gradoMinimo = min;
	}
	
	public void calcularCantAristas() throws Exception{
		for(int i=0;i<this.cantNodos;i++){
			for(int j=i;j<this.cantNodos;j++){
				if(m.getFilaColumna(i, j)){
					this.cantAristas++;
				}
			}
		}
	}

	public void calcularPorAdy(){
		float aristasTotales = (this.cantNodos*(this.cantNodos-1)/2);
		
		this.porAdy = (float) this.cantAristas / aristasTotales ;
	}
	
	public void imprimirEnArch(String ruta) throws Exception{
		this.calcularGrados();
		this.calcularCantAristas();
		this.calcularPorAdy();
		PrintWriter salida = new PrintWriter(new FileWriter(ruta));
		salida.println(this.cantNodos + " " + this.cantAristas + " "+ this.porAdy + " " + this.gradoMaximo + " " + this.gradoMinimo);
		for(int i=0;i<this.cantNodos;i++){
			for(int j=i;j<this.cantNodos;j++){
				if(m.getFilaColumna(i, j)){
					salida.println(i + " " + j);
					System.out.println(i + " " + j);
				}
			}
		}
		salida.close();
	}
	
	public void mostrarGrafo() throws Exception{
		for(int i=0;i<this.cantNodos;i++){
			for(int j=i;j<this.cantNodos;j++){
				if(m.getFilaColumna(i, j)){
					System.out.println("i: "+ i + " j: "+ j);
				}
			}
		}
	}
	
	public int getAristasMaximas() {
		return cantNodos* (cantNodos-1) /2;
	}
	
	// Getters & setters
	public int getCantNodos() {
		return cantNodos;
	}

	public void setCantNodos(int cantNodos) {
		this.cantNodos = cantNodos;
	}

	public int getGradoMaximo() {
		return gradoMaximo;
	}

	public void setGradoMaximo(int gradoMaximo) {
		this.gradoMaximo = gradoMaximo;
	}

	public int getGradoMinimo() {
		return gradoMinimo;
	}

	public void setGradoMinimo(int gradoMinimo) {
		this.gradoMinimo = gradoMinimo;
	}

	public int getCantAristas() {
		return cantAristas;
	}

	public void setCantAristas(int cantAristas) {
		this.cantAristas = cantAristas;
	}

}


