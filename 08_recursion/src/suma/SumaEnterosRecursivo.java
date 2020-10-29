/*
 * O(n)
 * El problema de este caso es que el stack donde se almacena cada
 * llamado se llenará (Stack Overflow) con cierta cantidad.
 */

package suma;

public class SumaEnterosRecursivo {
	public static int sumar(int n) {
		// Caso base
		if (n == 1) {
			return 1;
		}
		
		// Caso base 2
		if (n < 1) {
			return 0;
		}
		
		// Caso progresivo
		return n + sumar(n - 1);
	}
}
