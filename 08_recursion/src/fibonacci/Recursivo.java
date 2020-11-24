/*
 * Cálculo de la serie de Fibonacci. A través de una posición podemos calcular
 * el número dentro de la serie.
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
