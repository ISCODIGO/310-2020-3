package basico;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.LogRecord;

public class Arbol {
	private Nodo raiz;
	private int size;
	
	public Arbol() {
		raiz = null;
		size = 0;
	}
	
	public Nodo agregar(char c) {
		return this.agregar(c, this.raiz);
	}
	
	public Nodo agregar(char c, Nodo padre) {
		Nodo nuevo = new Nodo(c);	
		
		if (padre == null) {
			if (esRaiz(padre)) {
				raiz = nuevo;
			} else {
				padre = nuevo;
			}			
		} else {
			if (padre.izquierdo == null) {
				padre.izquierdo = nuevo;
			} else if (padre.derecho == null) {
				padre.derecho = nuevo;
			} else {
				return null;
			}			
		}	
		size++;
		return nuevo;
	}
		
	public boolean esRaiz(Nodo n) {
		return n == raiz;
	}		
	
	/*==========================================================================
	 * 						R E C O R R I D O S
	 =========================================================================*/
	
	public List<Character> preorden() {
		ArrayList<Character> listado = new ArrayList<Character>();
		preorden(this.raiz, listado);
		return listado;
	}
	
	private void preorden(Nodo n, List<Character> lista) {
		// caso base
		if (n == null) {
			return;
		}
		// 1. visita el nodo
		lista.add(n.getDato());
		// 2. recorrer la izquierda
		preorden(n.izquierdo, lista);
		// 3. recorrer la derecha
		preorden(n.derecho, lista);			
	}
	
	public List<Character> enorden() {
		ArrayList<Character> listado = new ArrayList<Character>();
		enorden(this.raiz, listado);
		return listado;
	}
	
	private void enorden(Nodo n, List<Character> lista) {
		// caso base
		if (n == null) {
			return;
		}

		// 1. recorrer la izquierda
		enorden(n.izquierdo, lista);
		// 2. visita el nodo
		lista.add(n.getDato());		
		// 3. recorrer la derecha
		enorden(n.derecho, lista);	
	}
	
	public List<Character> postorden() {
		ArrayList<Character> listado = new ArrayList<Character>();
		postorden(this.raiz, listado);
		return listado;
	}
	
	private void postorden(Nodo n, List<Character> lista) {
		// caso base
		if (n == null) {
			return;
		}
		
		// 1. recorrer la izquierda
		postorden(n.izquierdo, lista);
		// 2. recorrer la derecha
		postorden(n.derecho, lista);
		// 3. visita el nodo
		lista.add(n.getDato());		
	}
}
