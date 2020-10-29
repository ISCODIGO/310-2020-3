package recursion;

public class Ejemplo {
	public static void main(String[] args) {
		contar(1);
	}
	
	public static void contar(int n) {
		System.out.println(n);
		
		// [n < -12000] no logra ejecutar el caso progresivo
		// [n > 12000] logra acercarnos al caso base
		
		if (n < 12000) { // Caso Base
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
