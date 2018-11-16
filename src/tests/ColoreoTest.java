package tests;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;

import simetrica.GrafoNDNP;
import simetrica.ProgProbador;

public class ColoreoTest {

	// @Test
	public void test() throws Exception {

		GrafoNDNP prueba = new GrafoNDNP("./Grafo/grafoAleatorio.in");
		prueba.coloreoSecuencial(5);

	}

	@Test
	public void test2() throws Exception {
		int[] colores = new int[600];
		for (int c:colores){
			c=0;
		}
		for (int i = 0; i < 10000; i++) {
			System.out.println("Iteracion: " + i);
			GrafoNDNP prueba = new GrafoNDNP("./Grafo/grafoAleatorio.in");
			int color = prueba.coloreoMatula(1);
			colores[color]++;
			Assert.assertTrue(ProgProbador.PPT("./Grafo/grafoAleatorio.in", 
					"./Resultados/COLOREO_MATULA_600_0.9377184.out"));
		}
		PrintWriter out = new PrintWriter(new FileWriter("./Para Excel/matulaAdyAl90.csv"));
		//System.out.println("Cantidad de colores utilizados");
		for (int i=0;i<600;i++){
			if (colores[i]!=0){
				//System.out.println("Cantidad: " + i + " se utilizo: " +colores[i]);
				out.println(i +" ; " + colores[i]);
			}
		}
		out.close();
	}

	// @Test
	public void test3() throws Exception {

		GrafoNDNP prueba = new GrafoNDNP("./Grafo/grafoNyn.in");
		prueba.coloreoWelshPowell(1);

	}

}
