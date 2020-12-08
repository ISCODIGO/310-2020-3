package listahijos;

import java.util.LinkedList;
import java.util.List;

public class Arbol {
	public Nodo raiz;
	private int tamaño;
	
	public Arbol() {
		raiz = null;
		tamaño = 0;
	}
	
	public Nodo agregarNodo(char dato) {
		return this.agregarNodo(dato, raiz);
	}
	
	public Nodo agregarNodo(char dato, Nodo padre) {
		if (raiz != null && padre == null) {
			// este es un caso anomalo
			return null;
		}
		
		Nodo nuevo = new Nodo(dato);
		
		if (raiz == null) {
			// si no hay nodos en el arbol
			raiz = nuevo;
		} else {
			// el caso esperado 
			padre.agregar(nuevo);
		}
		
		this.tamaño++;
		return nuevo;
	}
	
	public boolean esRaiz(Nodo n) {
		return n == raiz;
	}
	
	public List<Character> recorrido() {
		LinkedList<Character> datos = new LinkedList<>();
		recorridoRecursivo(raiz, datos);
		return datos;
	}
	
	private void recorridoRecursivo(Nodo n, List<Character> datos) {
		if (n == null) {
			return;
		}	
		
		datos.add(n.getDato());
					
		// Caso progresivo: recorrer los hijos con este metodo
		for (int i = 0; i < n.hijos.size(); i++) {
			recorridoRecursivo(n.hijos.get(i), datos);
		}
	}
}
