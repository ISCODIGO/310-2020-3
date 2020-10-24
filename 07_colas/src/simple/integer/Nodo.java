/*
 * El nodo es la que estructura fundamental de una lista enlazada. 
 * Conectamos nodos de forma que tengamos una colección de elementos
 * creciendo o reduciendo de forma dinámica. Esta definición es la 
 * más sencilla posible. 
 */
package simple.integer;

public class Nodo {
	// atributos
	private int dato;			// cualquier tipo
	public Nodo siguiente;		// tipo Nodo
	
	public Nodo(int dato) {
		this.dato = dato;
		this.siguiente = null;
	}
	
	public int getDato() {
		return this.dato;
	}
	
	@Override
	public String toString() {
		return String.format("Nodo{%d} -> ", this.dato);
	}
}



