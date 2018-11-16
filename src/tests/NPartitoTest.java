package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import simetrica.NpartitosConNyn;

public class NPartitoTest {

	@Test
	public void test() throws Exception {
		NpartitosConNyn grafo = new NpartitosConNyn(5);
		grafo.generarConNyn(2);
		grafo.imprimirEnArch("./Grafo/grafoNyn.in");
	}

}
