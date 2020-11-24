/*
 * C�lculo de la serie de Fibonacci. A trav�s de una posici�n podemos calcular
 * el n�mero dentro de la serie.
 */

package fibonacci;

import cronometro.Cronometro;

public class Recursivo {
	public static void main(String[] args) {
		int n = 40;
		
		Cronometro cronometro = new Cronometro();
		int resultado = calcular(n);
		System.out.println(String.format("Fibonacci(%d) = %d", 
				n, resultado));
		cronometro.finalizar();
		System.out.println(cronometro);
	}
	
	public static int calcular(int n) {
		// caso base
		if (n < 2) {
			return n;
		}
		
		// caso progresivo
		return calcular(n - 1) + calcular(n - 2);
	}
}
