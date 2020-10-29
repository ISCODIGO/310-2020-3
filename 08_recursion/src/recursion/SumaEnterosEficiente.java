/*
 * O(1)
 * Utilizando la suma de una progresión aritmética se puede obtener mediante una
 * ecuación conocida para obtener los números triangulares de un valor dado.
 */
package recursion;

public class SumaEnterosEficiente {
	public static void main(String[] args) {
		int N = 100_000;
		
		int suma = (N * (N + 1)) / 2;
		System.out.println(suma);
	}
}
