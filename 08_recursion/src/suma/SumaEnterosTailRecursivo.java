/*
 * O(n)
 * En algunos lenguajes dejar el caso recursivo (progresivo) al final 
 * (Tail Recursion) permite que se pueda optimizar. En el caso particular de 
 * Java aún no es posible. Lo otro interesante de esta formación es que es 
 * posible sustituirlo por una iteración sencilla. 
 */

package suma;

public class SumaEnterosTailRecursivo {
	public static int sumar(int n) {
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
