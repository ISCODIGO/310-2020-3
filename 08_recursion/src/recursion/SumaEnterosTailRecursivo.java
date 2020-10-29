/*
 * O(n)
 * En algunos lenguajes dejar el caso recursivo (progresivo) al final 
 * (Tail Recursion) permite que se pueda optimizar. En el caso particular de 
 * Java aún no es posible. Lo otro interesante de esta formación es que es 
 * posible sustituirlo por una iteración sencilla. 
 */

package recursion;

public class SumaEnterosTailRecursivo {
	public static void main(String[] args) {
		System.out.println(suma(100_000));
	}

	public static int suma(int n) {
		return sumaRecursiva(n, 0);
	}

	public static int sumaRecursiva(int n, int acumulador) {
		if (n < 1) {
			return acumulador;
		}
		
		acumulador += n;
		
		if (n == 1) {
			return acumulador;
		}

		// Caso progresivo		
		return sumaRecursiva(n - 1, acumulador);
	}
}
