package listahijos;

import java.util.ArrayList;

public class Nodo {
	private int dato;
	public ArrayList<Nodo> hijos;
	
	public Nodo(int dato) {
		this.dato = dato;
		this.hijos = new ArrayList<>();
	}
	
	public void agregar(Nodo n) {
		hijos.add(n);
	}
	
	public int getDato() {
		return this.dato;
	}
}
