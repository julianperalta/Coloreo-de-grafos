package simetrica;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GeneradorAleatorios extends Generadora {

	public GeneradorAleatorios(int n) {
		super(n);

	}

	public void generarConProbabilidad(int prob) throws Exception {
		ArrayList<Integer[]> correctos = new ArrayList<Integer[]>();
		for (int i = 0; i < ((super.getCantNodos())); i++) {
			for (int j = i; j < ((super.getCantNodos())); j++) {
				int rand = (int) (Math.random() * 100);
				if (rand <= prob) {
					Integer[] vec = new Integer[2];
					vec[0] = i;
					vec[1] = j;
					correctos.add(vec);
					m.setFilaColumna(i, j, true);
				}
			}
		}
	}

}
