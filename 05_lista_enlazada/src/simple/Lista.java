package simple;

public class Lista {
	private Nodo primero;
	private Nodo ultimo;	
	private int conteo;
	
	public Lista() {
		this.vaciar();
	}
	
	public boolean estaVacia() {		
		return (ultimo == null);
	}
	
	public int getPrimero() {
		return primero.getDato();
	}

	public int getUltimo() {
		return ultimo.getDato();
	}
	
	// opcion 1: O(n) tiene 5 lineas
	public int getConteoIterativo() {
		int n = 0;
		for (Nodo aux = primero; aux != null; aux = aux.siguiente) {
			n++;
		}
		
		return n;
	}
	
	// opcion 2: O(1) el manejo de la variable conteo tiene 6 lineas
	public int getConteo() {
		return conteo;
	}
	
	public void insertarPrimero(int dato) {
		Nodo nuevo = new Nodo(dato);
		nuevo.siguiente = primero;
		primero = nuevo;
		
		if (ultimo == null) {
			ultimo = nuevo;
		}
		
		conteo++;
	}
	
	public void insertarUltimo(int dato) {
		Nodo nuevo = new Nodo(dato);
		
		if (ultimo == null) {
			primero = nuevo;
			ultimo = nuevo;
		} else {
			ultimo.siguiente = nuevo;
			ultimo = nuevo;	
		}				

		conteo++;
	}
	
	public int eliminarPrimero() {		
		int valor = primero.getDato();
		primero = primero.siguiente;
		conteo--;
		return valor;
	}
	
	public int eliminarUltimo() {
		int valor = ultimo.getDato();	
		Nodo penultimo = primero;
		
		for (Nodo item = primero; item.siguiente != null; item = item.siguiente) {
			penultimo = item;
		}

		penultimo.siguiente = null;
		ultimo = penultimo;
		conteo--;
		return valor;
	}

	public void vaciar() {
		primero = null;
		ultimo = null;
		conteo = 0;
	}
	
	public int[] getArreglo() {
		int[] datos = new int[conteo];
		int i = 0;
		for (Nodo aux = primero; aux != null; aux = aux.siguiente) {
			datos[i++] = aux.getDato();
		}
		
		return datos;
	}
	
}
