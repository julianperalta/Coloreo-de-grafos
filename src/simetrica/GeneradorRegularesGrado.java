package simetrica;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class GeneradorRegularesGrado extends Generadora {

	public GeneradorRegularesGrado(int cantNodos) {
		super(cantNodos);
	}
	
	public boolean generarConNyGrado(int grado) throws Exception {
		//ArrayList<Integer[]> correctos = new ArrayList<Integer[]>();
		
		if(grado>(this.getCantNodos() -1)) {
			return false;
		}
		
		if(this.getCantNodos() % 2 != 0 && grado %2 !=0) {
			return false;
		}
		int paso =1;
		super.calcularGrados();
		while(super.getGradoMaximo()<grado || super.getGradoMinimo()<grado) {
			System.out.println(super.getGradoMaximo());
		for(int i= 0; i<super.getCantNodos();i++) {
			
			if(i+paso<super.getCantNodos()  && contarAristasNodo(i)<grado) {
			m.setFilaColumna(i, i+paso, true);
			}
			
		}
		paso++;
		
		super.calcularGrados();
		if(super.getGradoMinimo()==1) {
			m.setFilaColumna(super.getCantNodos()-1, 0, true);
		}
	}
		return true;

	}
	
	public int contarAristasNodo(int nodo) throws Exception {
		int cant =0;
		for(int i =0;i<super.getCantNodos();i++) {
			if(m.getFilaColumna(nodo, i)==true) {
				cant++;
			}
		}
		return cant;
	}
	
	public boolean generarConPorAdy(double porAd) throws Exception{
		int grado = (int) (porAd * (super.getCantNodos()-1));
		boolean aa = this.generarConNyGrado(grado);
		return aa;
	}
	
	

}
