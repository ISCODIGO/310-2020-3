package suma;

public class Ejemplo {
	public static void main(String[] args) {
		contar(1);
	}
	
	public static void contar(int n) {
		System.out.println(n);
		
		// (n < -1000) no logra ejecutar el caso progresivo
		// (n < 1000) logra acercarnos al caso base
		// (n > 1000) no logra ejecutar el caso progresivo
		
		if (n < -1000) { // Caso Base
			contar(n+1); // Caso progresivo/recursiva
		}
	}
	
	public void recursivaDirecta() {
		// Recursion directa
		recursivaDirecta();
	}
	
	public void recursivaIndirecta() {
		// Recursion indirecta: no se llama directamente a si misma
		auxiliar();
	}
	
	public void auxiliar() {
		recursivaIndirecta();
	}
}
