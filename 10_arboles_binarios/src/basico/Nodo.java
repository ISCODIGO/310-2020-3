package basico;

import java.util.ArrayList;

public class Nodo {
	private char dato;
	public Nodo izquierdo;
	public Nodo derecho;
	
	public Nodo(char dato) {
		this.dato = dato;
		this.izquierdo = null;
		this.derecho = null;
	}
	
	public char getDato() {
		return this.dato;
	}
	
	public boolean esHoja() {
		// Un nodo que no tiene hijos
		return (this.izquierdo == null && this.derecho == null);
	}	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(this.dato);
	}
}
