package simetrica;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class GeneradorRegularAdy extends Generadora {
	
	private double ady;
	int grado;

	public GeneradorRegularAdy(int n, double ady) {
		super(n);
		this.ady = ady;
	}

	public void generar() throws Exception {

		int g = (int) (ady * (getCantNodos()-1));
		
		int cantnodos = super.getCantNodos();
		int llenar = g;
		ArrayList<Integer> almacenar = new ArrayList<Integer>();

		int low = 1;
		int high = cantnodos - 1;
		Random r = new Random();
		int res = -1;
		int[] vecgra = new int[cantnodos];

		for (int i = 0; i < cantnodos - 1; i++) {

			for (int j = i + 1; j < cantnodos; j++) {
				super.m.setFilaColumna(i, j, false);
			}

		}

		if (g > cantnodos - 1) {
			System.out.println("El grado pedido supera la cantidad de nodos ");
			return;
		}

		if (cantnodos % 2 != 0 && g % 2 != 0) {
			System.out.println("La cantidad de nodos es impar y el grado ingresado es impar ");
			return;
		}

		int d = 0;
		if (g == 1)
			for (int i = 0; i < cantnodos / 2; i += 2)
				super.m.setFilaColumna(i, i + 1, true);
		else {
			int contar = 0;
			int a = 0;
			while (contar < g) {
				contar = 0;
				d = a;
				for (int i = -1; i < a; i++) {

					super.m.setFilaColumna(i + 1, cantnodos - 1 - d, true);

					d--;
				}

				super.m.setFilaColumna(a, cantnodos - 1, true);

				for (int i = 0; i < cantnodos - 1 - a; i++) {

					super.m.setFilaColumna(i, i + 1 + a, true);

				}

				for (int i = 1; i < cantnodos; i++) {

					if (super.m.getFilaColumna(0, i))
						contar++;
				}

				a++;

			}

	

		}
	}

}
