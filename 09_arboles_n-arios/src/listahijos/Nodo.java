package listahijos;

import java.util.ArrayList;

public class Nodo {
	private char dato;
	public ArrayList<Nodo> hijos;
	
	public Nodo(char dato) {
		this.dato = dato;
		this.hijos = new ArrayList<>();
	}
	
	public void agregar(Nodo n) {
		hijos.add(n);
	}
	
	public char getDato() {
		return this.dato;
	}
	
	public boolean esHoja() {
		// Un nodo que no tiene hijos
		return this.hijos.isEmpty(); 
	}
}
