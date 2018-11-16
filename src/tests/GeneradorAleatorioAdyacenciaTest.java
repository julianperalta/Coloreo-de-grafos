package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import simetrica.GeneradorAleatorioAdyacencia;

public class GeneradorAleatorioAdyacenciaTest {

	@Test
	public void test() throws Exception {
		GeneradorAleatorioAdyacencia ad = new GeneradorAleatorioAdyacencia(98);
		ad.generarAdyacencia(0.70);
		ad.imprimirEnArch("./Grafo/ArchivoGrafoAleatorioAdyacenciaNazi.in");
	}

}
