package tests;

import org.junit.Test;

import simetrica.GeneradorAleatorioAdyacencia;
import simetrica.NpartitosConNyn;

public class MuchosNodosTests {

	@Test
	public void GrafoAleatorioAdyacenciaMuchosNodos() throws Exception {
		long inicio = java.lang.System.currentTimeMillis();
		GeneradorAleatorioAdyacencia ad = new GeneradorAleatorioAdyacencia(600);
		ad.generarAdyacencia(0.9);
		ad.imprimirEnArch("./Grafo/grafoAleatorio.in");
		long fin = java.lang.System.currentTimeMillis();
		long total = fin - inicio;
		System.out.println("Tiempo de procesamiento: " + total +" milisegundos");
	}
	
	
	//@Test
	public void GrafoNyNTest() throws Exception{
		long inicio = java.lang.System.currentTimeMillis();
		NpartitosConNyn grafo = new NpartitosConNyn(500);
		
		grafo.generarConNyn(2);
		grafo.imprimirEnArch("./Grafo/grafoNyn.in");
		long fin = java.lang.System.currentTimeMillis();
		long total = fin - inicio;
		System.out.println("Tiempo de procesamiento: " + total +" milisegundos");
	}
}
