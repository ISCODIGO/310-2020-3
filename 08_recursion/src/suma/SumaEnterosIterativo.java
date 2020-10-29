/*
 * O(n)
 * Esta es la version iterativa para sumar una secuencia de numeros enteros
 */

package suma;

public class SumaEnterosIterativo {
	public static int sumar(int n) {
		int total = 0;
		
		for (int i = 1; i <= n; i++) {
			total += i;
		}
		
		return total;
	}
}

