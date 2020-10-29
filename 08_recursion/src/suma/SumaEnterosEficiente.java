/*
 * O(1)
 * Utilizando la suma de una progresión aritmética se puede obtener mediante una
 * ecuación conocida para obtener los números triangulares de un valor dado.
 */
package suma;

public class SumaEnterosEficiente {
	public static int sumar(int n) {
		return (n * (n + 1)) / 2;
	}
}
