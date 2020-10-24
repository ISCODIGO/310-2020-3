/*
 * El contenedor sea el nucleo del TDA Cola.
 * En realidad ColaLL es un wrapper o envoltorio de la lista enlazada.
 */
package cola;

import simple.integer.*;

public class ColaLL {
	private Lista contenedor;
	
	public ColaLL() {
		contenedor = new Lista();
	}
	
	public boolean estaVacia() {
		return contenedor.estaVacia();
	}
	
	public void agregar(int dato) {
		contenedor.insertarUltimo(dato);
	}
	
	public int eliminar() {
		return contenedor.eliminarPrimero();
	}
	
	public int frente() {
		return contenedor.getPrimero();
	}
	
	public int[] toArray() {
		return contenedor.getArreglo();
	}
}
