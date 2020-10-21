package simple.integer;

public class MainNodo {
	public static void main(String[] args) {
		Nodo n1 = new Nodo(10);
		Nodo n2 = new Nodo(20);
		Nodo n3 = new Nodo(30);
		
		n1.siguiente = n2;		
		n2.siguiente = n3;
		
		System.out.print(n1);
		
		// n2
		System.out.print(n1.siguiente);
		
		// n2.siguiente
		// n3
		System.out.print(n1.siguiente.siguiente);
		
		// n2.siguiente.siguiente
		// n3.siguiente
		System.out.print(n1.siguiente.siguiente.siguiente);
		
		System.out.println("Recorrido por iteracion...\n");
		Nodo temp = n1;
		while (temp != null) {
			System.out.print(temp);
			temp = temp.siguiente;
		}
	}
}
