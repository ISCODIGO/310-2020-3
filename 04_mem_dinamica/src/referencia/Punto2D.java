/*
 * Objetivo: Identificar un objeto Mutable.
 * Probar como se realiza la referencia en objetos mutables definidos por el usuario.
 * Revisar que la modificacion de un objeto referenciado manipula a los otros que tambien hagan referencia.
 */
package referencia;

public class Punto2D {
	public int x;
	public int y;
	
	public Punto2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format("(x=%d, y=%d)", this.x, this.y);
	}
	
	public static void main(String[] args) {
		Punto2D p01 = new Punto2D(1, 1);
		System.out.println("Punto 1...");
		System.out.println(p01);				
		
		// Referencia
		System.out.println("Punto 2 (Referenciado)...");
		Punto2D p02 = p01;
		System.out.println(p02);
		
		System.out.println(p01 == p02);
				
		// Cambiar atributo
		System.out.println("Punto 1 (Cambiando atributo a p02)...");
		p01.x = 23;
		System.out.println(p01);
		System.out.println(p02);
	}
}
