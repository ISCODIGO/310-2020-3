package listahijos;

public class Main {
	public static void main(String[] args) {
		Arbol tree = new Arbol();
		Nodo A = tree.agregarNodo(10);
		Nodo B = tree.agregarNodo(20);
		Nodo C = tree.agregarNodo(30);
		Nodo D = tree.agregarNodo(40);
		Nodo E = tree.agregarNodo(50, B);
		Nodo F = tree.agregarNodo(60, B);
		Nodo G = tree.agregarNodo(70, B);
		Nodo H = tree.agregarNodo(80, D);
	}
}
