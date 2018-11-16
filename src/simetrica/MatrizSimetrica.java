package simetrica;

public class MatrizSimetrica {
	private boolean[] nodos;
	int cantidad;
	int n;
	
	public MatrizSimetrica(int n){
		
	
		int cant = n*(n-1)/2;
		this.n = n;
		this.cantidad = cant;
		this.nodos = new boolean[cant];

	}
	
	public int getI(int fila, int columna){
		return fila * n +columna -((int)Math.pow(fila, 2)+3*fila+2)/2;
	}
	
	
	public boolean getFilaColumna(int fila,int columna) throws Exception{
		if(fila==columna){
			return false;
		}
		if(fila>columna){
			int aux = fila;
			fila = columna;
			columna = aux;
		}
		int indice =  getI(fila,columna);
		return this.nodos[indice];
	}
	
	public void setFilaColumna(int fila, int columna,boolean valor) throws Exception{

		if(fila==columna){
			return;
		}
		if(fila>columna){
			int aux = fila;
			fila = columna;
			columna = aux;
		}
		int indice =  getI(fila,columna);
		this.nodos[indice] = valor;
	}
	
	public static void main(String args[]) throws Exception{
		MatrizSimetrica ms = new MatrizSimetrica(5);
		ms.setFilaColumna(0, 1, true);
		ms.setFilaColumna(0, 2, true);

		ms.setFilaColumna(1, 3, true);
		ms.setFilaColumna(2, 3, true);
		ms.setFilaColumna(3, 4, true);

		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(i!=j)
				System.out.println("Posicion "+ i + " "+ j+": "+ms.getFilaColumna(i, j));
				
			}
			
			
		}
	
	
	}

}
