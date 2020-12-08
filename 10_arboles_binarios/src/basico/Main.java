package basico;

public class Main {
	public static void main(String[] args) {
		Arbol bin = new Arbol('A');		
		Nodo A = bin.agregar('A', bin.raiz);		
		Nodo B = bin.agregar('B', bin.raiz);
		Nodo C = bin.agregar('C', A);
		Nodo D = bin.agregar('D', B);
		Nodo E = bin.agregar('E', B);
		Nodo F = bin.agregar('F', C);
		Nodo H = bin.agregar('H', D);
		Nodo I = bin.agregar('I', D);
	}
}
