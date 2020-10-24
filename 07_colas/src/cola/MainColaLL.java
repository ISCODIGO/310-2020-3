package cola;

import java.util.Arrays;

public class MainColaLL {
	public static void main(String[] args) {
		ColaLL q = new ColaLL();
		q.agregar(10); // 10 - frente
		q.agregar(20); // 10 - frente/20 - final
		q.agregar(30); // 10-frente/30-final
		
		System.out.println("Frente es 10: " + q.frente());
		System.out.println(Arrays.toString(q.toArray()));
		
		int del1 = q.eliminar();
		System.out.println(del1);
		System.out.println(Arrays.toString(q.toArray()));
	}
}
