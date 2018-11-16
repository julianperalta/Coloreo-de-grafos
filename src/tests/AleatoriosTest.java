package tests;

import org.junit.*;

import simetrica.GeneradorAleatorios;

public class AleatoriosTest {

	@Test
	public void testAleatorios() throws Exception{
		
		GeneradorAleatorios gene = new GeneradorAleatorios(5);
		gene.generarConProbabilidad(70);
		gene.imprimirEnArch("./Grafo/grafo.in");
	}


	
}
