package tests;
import org.junit.*;

import simetrica.GeneradorRegularesGrado;
public class RegularesTest {
	@Test
	public void testRegularesGrado() throws Exception{
		GeneradorRegularesGrado gene = new GeneradorRegularesGrado(5);
		gene.generarConNyGrado(4);
		gene.imprimirEnArch("./Grafo/grafoRegular.in");
		
	}
}
