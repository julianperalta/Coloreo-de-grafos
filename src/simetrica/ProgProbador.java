package simetrica;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ProgProbador {

	@SuppressWarnings("unused")
	public static boolean PPT(String pathIn, String pathOut) throws FileNotFoundException {

		// Leer archivo
		Scanner sc = new Scanner(new FileReader(pathIn));
		sc.useLocale(Locale.ENGLISH);
		Scanner salida = new Scanner(new FileReader(pathOut));
		salida.useLocale(Locale.ENGLISH);
		int cantNodos = salida.nextInt();
		int cantidadColores = salida.nextInt();
		int cantidadAristas = salida.nextInt();
		double porcentajeAdy = salida.nextDouble();
		int gradoMax = salida.nextInt();
		int gradoMin = salida.nextInt();
		ArrayList<Nodo> arrayListNodosColor = new ArrayList<>();
		ArrayList<Arista> aristas = new ArrayList<>();
		int[] vecColores = new int[cantNodos];

		sc.nextLine();

		if (porcentajeAdy >= 1 && cantNodos != cantidadColores) {
			salida.close();
			sc.close();
			return false;
		}
		
		for (int i = 0; i < cantNodos; i++) {
			Arista a1 = new Arista(sc.nextInt(), sc.nextInt());
			//System.out.println("Nodo origen: " + a1.getNodoOrig() + " Nodo Dest: " + a1.getNodoDest());
			arrayListNodosColor.add(new Nodo(salida.nextInt(), vecColores[i] = salida.nextInt()));

			//System.out.println(vecColores[i]);
			aristas.add(a1);
		}
		//System.out.println("Tamaño: " + arrayListNodosColor.size());

		int max = 0;
		for (int i : vecColores) {
			if (i > max)
				max = i;
		}

		if (cantidadColores != max) {

			salida.close();
			sc.close();
			return false;
		}
		/** Aquí va la lógica, tener en cuenta todos los adyacentes a un nodo */
		for (Nodo nodo : arrayListNodosColor) {

			int colorAct = nodo.getColor();

			for (Arista arista : aristas) {
				if (arista.getNodoOrig() == nodo.getNroNodo()
						&& colorAct == arrayListNodosColor.get(arista.getNodoDest()).getColor()) {
					salida.close();
					sc.close();
					return false;
				} else if (arista.getNodoDest() == nodo.getNroNodo()
						&& colorAct == arrayListNodosColor.get(arista.getNodoOrig()).getColor()) {
					salida.close();
					sc.close();
					return false;
				}
			}
		}

		// 1_si es totalmente conexo la cantidad de colores tiene que ser igual
		// a la
		// cantidad de nodos

		// 2_verificar que la cantidad de colores sea igual que la cantidad de
		// colores en los nodos

		// 3_Verificar que los adyacentes tengan colores distintos

		salida.close();
		sc.close();
		return true;
	}
	
	public static void main(String[] args) throws IOException {

		if (PPT("./Grafo/grafoAleatorioAl40.in", "./Resultados/grafoResultante.out") == true)
			System.out.println("TODO OK");
		else
			System.out.println("FALLO EL COLOREO");

	}
}
