package listahijos;

public class Arbol {
	public Nodo raiz;
	private int tamaño;
	
	public Arbol() {
		raiz = null;
		tamaño = 0;
	}
	
	public Nodo agregarNodo(int dato) {
		return this.agregarNodo(dato, raiz);
	}
	
	public Nodo agregarNodo(int dato, Nodo padre) {
		Nodo nuevo = new Nodo(dato);
		
		if (raiz == null) {
			// si no hay nodos en el arbol
			raiz = nuevo;
			return raiz;
		} else if (padre == null) {
			// entrada invalida
			return null;
		} else {
			// el caso esperado 
			padre.agregar(nuevo);
			return nuevo;
		}
	}
}
