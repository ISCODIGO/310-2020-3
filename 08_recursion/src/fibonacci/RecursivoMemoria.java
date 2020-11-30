package fibonacci;

import cronometro.Cronometro;

public class RecursivoMemoria {
	public static void main(String[] args) {
		int n = 40;

		Cronometro cronometro = new Cronometro();
		int resultado = calcular(n, null);
		System.out.println(String.format("Fibonacci(%d) = %d", n, resultado));
		cronometro.finalizar();
		System.out.println(cronometro);
	}

	static int calcular(int n, int[] memoria) {
		if (n < 2) {
			return n;
		}

		// si no hay memoria
		if (memoria == null) {
			memoria = new int[n + 1];
			memoria[0] = 0;
			memoria[1] = 1;
		}

		// si el resultado ya esta almacenado se devuelve
		if (n > 1 && memoria[n] != 0) {
			return memoria[n];
		}

		// la progresion normal
		memoria[n] = calcular(n - 1, memoria) + calcular(n - 2, memoria);
		return memoria[n];
	}
}
