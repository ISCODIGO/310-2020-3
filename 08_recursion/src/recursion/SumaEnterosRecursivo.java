/*
 * O(n)
 * El problema de este caso es que el stack donde se almacena cada
 * llamado se llenará (Stack Overflow) con cierta cantidad.
 */

package recursion;

public class SumaEnterosRecursivo {
	public static void main(String[] args) {
		System.out.println(suma(100_000));
	}
	
	public static int suma(int n) {
		// Caso base
		if (n == 1) {
			return 1;
		}
		
		// Caso base 2
		if (n < 1) {
			return 0;
		}
		
		// Caso progresivo
		return n + suma(n - 1);
	}
}
