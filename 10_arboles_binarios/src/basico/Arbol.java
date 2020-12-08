package basico;

import java.util.LinkedList;
import java.util.List;

public class Arbol {
	public Nodo raiz;
	private int tamaño;
	
	public Arbol(char c) {
		raiz = new Nodo(c);
		tamaño = 0;
	}
	
	public Nodo agregar(char c, Nodo padre) {
		Nodo nuevo = new Nodo(c);
		
		if (padre == null) {
			padre = nuevo;
		} else {
			if (padre.izquierdo == null) {
				padre.izquierdo = nuevo;
			} else if (padre.derecho == null) {
				padre.derecho = nuevo;
			} else {
				return null;
			}
			
		}	

		return nuevo;
	}
		
	public boolean esRaiz(Nodo n) {
		return n == raiz;
	}		
}
