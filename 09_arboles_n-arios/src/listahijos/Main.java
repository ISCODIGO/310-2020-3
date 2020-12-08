package listahijos;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Arbol tree = new Arbol();
		Nodo A = tree.agregarNodo('A');
		Nodo B = tree.agregarNodo('B');
		Nodo C = tree.agregarNodo('C');
		Nodo D = tree.agregarNodo('D');
		Nodo E = tree.agregarNodo('E', B);
		Nodo F = tree.agregarNodo('F', B);
		Nodo G = tree.agregarNodo('G', B);
		Nodo H = tree.agregarNodo('H', D);
						
		if (C.esHoja()) {
			System.out.println("No tiene hijos");
		} else {
			System.out.println("Tiene hijos");
		}
		
		if (tree.esRaiz(C)) {
			System.out.println("Este nodo es raiz");
		} else {
			System.out.println("El nodo no es una raiz");
		}
		
		List<Character> ll = tree.recorrido();
		System.out.println(Arrays.toString(ll.toArray()));
	}
}
