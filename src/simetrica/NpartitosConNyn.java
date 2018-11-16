package simetrica;

import java.util.ArrayList;
import java.math.*;

public class NpartitosConNyn extends Generadora {

	public NpartitosConNyn(int cantNodos) {
		super(cantNodos);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Versión de Carlitos N --> Cantidad de Nodos g --> Cantidad de grupos
	 * 
	 * @param args
	 */
	/*
	 * public static void main(String []args) { int n = 7; int g =2; int c =n/g;
	 * 
	 * if(n % g == 0 ) { c=n/g; } else { aux=n; for(int i =g-1 ;i>0;i++) {
	 * vc[i]=cantNodosDeEseGrupo } }
	 * 
	 * System.out.println(c); ArrayList<Integer[]> nue = new ArrayList<Integer[]>();
	 * ArrayList<Integer> utilizados = new ArrayList<Integer>(); for (int
	 * i=0;i<c;i++) { for(int j=0;j<g;j++) { int rand = (int) Math.random() * n; int
	 * aa[] = new int[c];
	 * 
	 * do { aa[j] = rand; } while(!utilizados.contains(rand));
	 * 
	 * } } System.out.println(n/g); }
	 */

	/**
	 * 
	 * @param grupo Numero de grupos - ES el n digamos.
	 * @throws Exception
	 */
	public void generarConNyn(int grupo) throws Exception {
		int cantNodos = super.getCantNodos();
		int nodosPorGrupo = cantNodos / grupo;
		int nodosUltimoGrupo = nodosPorGrupo + cantNodos % grupo;
		int numeroGrupo = 1; //Numero del grupo actual.
		int posGrupo = 0; 

		for (int i = 0; i < cantNodos; i++) { // filas
			int cantAux;
			if (numeroGrupo == grupo)
				cantAux = nodosUltimoGrupo;
			else
				cantAux = nodosPorGrupo - posGrupo;
			if (posGrupo == nodosPorGrupo && numeroGrupo < grupo)
				posGrupo = 0;

			for (int j = i; j < cantNodos; j++) { // columnas

				if (cantAux > 0) {
					super.m.setFilaColumna(i, j, false);
					cantAux--;
				} else
					super.m.setFilaColumna(i, j, true);

			}
			posGrupo++;
			if ((i+1) % nodosPorGrupo == 0) {
				numeroGrupo++;
				posGrupo = 0;
			}

		}

//		for (int i = 0; i < cantNodos; i++) { // filas
//			System.out.println("Nodo: " + i);
//
//			if (i % nodosPorGrupo == 0) {
//				numGrupo++;
//				colDeLlenado += nodosPorGrupo;
//			}
//
//			if (numGrupo < grupo) {
//				for (int j = colDeLlenado; j < cantNodos; j++) { // columnas
//					super.m.setFilaColumna(i, j, true);
//				}
//			}
//
//		}

	}
}
