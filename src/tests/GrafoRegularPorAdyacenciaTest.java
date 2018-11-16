package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import simetrica.GeneradorRegularesGrado;

public class GrafoRegularPorAdyacenciaTest {

	@Test
	public void test() throws Exception {
		GeneradorRegularesGrado gene = new GeneradorRegularesGrado(5);
		gene.generarConPorAdy(0.50);
		gene.imprimirEnArch("./Grafo/RegularGradoNPorcentajeAdyacencia.in");
	}

}
