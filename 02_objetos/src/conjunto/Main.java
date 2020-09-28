package conjunto;

public class Main {
	public static void main(String[] args) {
		Conjunto c1 = new Conjunto(10);

		c1.agregar(1);
		c1.agregar(2);
		c1.agregar(5);

		Conjunto c2 = new Conjunto(10);
		c2.agregar(5);
		c2.agregar(2);
		c2.agregar(9);

		System.out.println("Union de dos conjuntos...");
		Conjunto c3 = c1.union(c2);
		System.out.println(c3);
		
		System.out.println("Interseccion de dos conjuntos...");
		Conjunto c4 = c1.interseccion(c2);
		System.out.println(c4);
		
		System.out.println("Complemento de un conjunto...");
		Conjunto c5 = c1.complemento();
		System.out.println(c5);
		
		System.out.println("Valor si pertenece...");
		System.out.println(c1.pertenece(2));
		
		System.out.println("Valor no pertenece...");
		System.out.println(c1.pertenece(0));		
	}
}
