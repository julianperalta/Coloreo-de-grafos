package simetrica;

public class Arista {

	
	private int nodoOrig;
	private int nodoDest;
	public Arista(int origen, int destino) {
		// TODO Auto-generated constructor stub
		nodoOrig = origen;
		nodoDest=destino;
	}
	public int getNodoOrig() {
		return nodoOrig;
	}
	public void setNodoOrig(int nodoOrig) {
		this.nodoOrig = nodoOrig;
	}
	public int getNodoDest() {
		return nodoDest;
	}
	public void setNodoDest(int nodoDest) {
		this.nodoDest = nodoDest;
	}
	
	

}
