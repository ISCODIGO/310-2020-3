/**
 * Crear un TDA que defina las operaciones de un conjunto (set).
 * Se almacenan valores únicos.
 * Serán enteros (en este caso).
 * Operaciones: union, interseccion, complemento.
 */

package conjunto;

public class Conjunto {
	// Atributos (variables)
	private boolean[] universo;
	
	// Metodo constructor: inicializa el array
	public Conjunto(int size) {
		// Inicializa el array con el tamaño establecido.
		// Incluyendo el propio tamaño.
		this.universo = new boolean[size + 1];
	}
	
	// Metodos para manipular elementos dentro del universo
	public void agregar(int valor) {
		universo[valor] = true;
	}
	
	public void remover(int valor) {
		universo[valor] = false;
	}
	
	// Se asume que ambos conjuntos tienen el mismo universo
	public Conjunto union(Conjunto otro) {
		Conjunto aux = new Conjunto(this.universo.length);
		
		for (int i = 0; i < universo.length; i++) {
			if (this.universo[i] || otro.universo[i]) {
				aux.universo[i] = true;
			}
		}
		
		return aux;
	}
	
	@Override
	public String toString() {
		// Se utilizará StringBuilder para mejorar el uso
		// de concatenacion de String
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		
		for (int i = 0; i < universo.length; i++) {
			if (universo[i]) {
				sb.append(i);
				sb.append(",");
			}			
		}
		sb.append("}");
		return sb.toString();
	}
	
}
