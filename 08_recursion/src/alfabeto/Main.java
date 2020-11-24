/*
 * Recorrido a traves de recursion indirecta
 */

package alfabeto;

public class Main {
	public static void main(String[] args) {
		System.out.println();
		metodoA('Z');
		System.out.println();
	}
	
	public static void metodoA(char letra) {
		if (letra >= 'A') {
			metodoB(letra);
			System.out.println(letra);
		}
	}
	
	public static void metodoB(char letra) {
		metodoA(--letra);
	}
}
