package simple;

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



