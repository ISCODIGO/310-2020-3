/*
 * O(n)
 * Esta es la version iterativa para sumar una secuencia de numeros enteros
 */

package recursion;

public class SumaEnterosIterativo {
	public static void main(String[] args) {
		int N = 100_000;
		int total = 0;
		
		for (int i = 1; i <= N; i++) {
			total += i;
		}
		
		System.out.println(String.format(
				"Los valores desde 1 hasta %d suman %d", 
				N, total));
	}
}

