package pila;

public class MainPilaLL {
	public static void main(String[] args) {
		PilaLL pila = new PilaLL();
		pila.insertar(10);
		pila.insertar(20);
		pila.insertar(30);

		System.out.println("Top: " + pila.cima());
		System.out.println("Pop: " + pila.remover());
		System.out.println("Pop: " + pila.remover());
	}

}
