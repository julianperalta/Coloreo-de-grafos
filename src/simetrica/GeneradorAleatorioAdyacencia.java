package simetrica;

public class GeneradorAleatorioAdyacencia extends Generadora {

	public GeneradorAleatorioAdyacencia(int cantNodos) {
		super(cantNodos);
	}
	
	public void generarAdyacencia(double porcAdy) throws Exception {
		int aristasFinales = (int) (super.getAristasMaximas()*porcAdy);
		while(aristasFinales > 0) {
			for(int i = 0; i < super.getCantNodos(); i++) {
				for(int j = i; j < super.getCantNodos(); j++) {
					int rand = (int)(Math.random() * 10);
					if(rand >=5 & m.getFilaColumna(i, j) == false) {
						m.setFilaColumna(i, j, true);
						aristasFinales--;
					}
				}
			}
		}
	}
	
	
}
