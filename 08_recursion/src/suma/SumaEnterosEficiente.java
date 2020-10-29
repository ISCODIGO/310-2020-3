/*
 * O(1)
 * Utilizando la suma de una progresi�n aritm�tica se puede obtener mediante una
 * ecuaci�n conocida para obtener los n�meros triangulares de un valor dado.
 */
package suma;

public class SumaEnterosEficiente {
	public static int sumar(int n) {
		return (n * (n + 1)) / 2;
	}
}
