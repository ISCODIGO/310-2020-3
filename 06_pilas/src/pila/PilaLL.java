/*
 * Es una clase envoltoria (wrapper) ya que envuelve
 * la caracteristicas de una lista enlazada.
 * 
 */
package pila;

import simple.integer.*;

public class PilaLL {
	// Lista simplemente enlazada (int)
	private Lista lista;
	
	public PilaLL() {
		lista = new Lista();
	}
	
	public void insertar(int dato) {
		lista.insertarPrimero(dato);
	}
	
	public int remover() {
		return lista.eliminarPrimero();
	}
	
	// obtiene el valor de la cima sin removerlo.
	public int cima() {
		return lista.getPrimero();
	}
	
	public void vaciar() {
		lista.vaciar();
	}
}
