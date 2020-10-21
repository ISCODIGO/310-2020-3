/**
 * Objetivo: Identificar que los objetos s1 y s2 apuntan al mismo valor "Hola"
 * Con la creacion de s3 mediante el operador new este es otro objeto.
 * Al modificar s2 se construye un nuevo objeto. Debido a la naturaleza inmutable del String
 * El operador == en Java revisa en los objetos si estos hacen referencia a la misma dirección de memoria
 */

package referencia;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "hola";
		String s2 = "hola";
		
		System.out.println("Comparando s1 y s2...");
		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1.equals(s2): " + s1.equals(s2));
		
		
		String s3 = new String("hola");
		System.out.println("Comparando s1 y s3...");
		System.out.println("s1 == s3: " + (s1 == s3));
		System.out.println("s1.equals(s3): " + s1.equals(s3));
		
		
		s2 = s1.toUpperCase();
		System.out.println("Comparando s1 y s2 (mayuscula)...");
		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1.equals(s2): " + s1.equals(s2));
		
	}
}
