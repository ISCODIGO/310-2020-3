package eficiencia;

public class Array2D {
	public static void main(String[] args) {
		int[][] datos = {{1, 2}, {2, 4}, {6, 4}};
		int suma = sumar(datos);
		System.out.println("La suma es: " + suma);
	}
	
	
	public static int sumar(int[][] valores) {
		int total = 0;
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				total += valores[i][j];
			}
		}
		
		return total;
	}
}
