package simple.integer;

public class MainLista {
	public static void main(String[] args) {
		testVacia();				
		testInsertarPrimero();
		testInsertarUltimo();
		testEliminarPrimero();
		testEliminarUltimo();
	}
	
	public static void testVacia() {
		System.out.println("PRUEBAS LA FUNCION ESTA VACIA");
		Lista lista = new Lista();
		System.out.println("True: " + lista.estaVacia());
		lista.insertarPrimero(10);
		System.out.println("False: " + lista.estaVacia());
	}
	
	public static void testInsertarPrimero() {
		System.out.println("PRUEBAS LA FUNCION INSERTAR PRIMERO");
		Lista lista = new Lista();
		lista.insertarPrimero(10);
		System.out.println(String.format("Primero es 10: %d. Conteo es 1: %d", 
				lista.getPrimero(), lista.getConteo()));
		lista.insertarPrimero(20);
		lista.insertarPrimero(30);
		System.out.println(String.format("Primero es 30: %d. Conteo es 3: %d",
				lista.getPrimero(), lista.getConteo()));
	}
	
	public static void testInsertarUltimo() {
		System.out.println("PRUEBAS LA FUNCION INSERTAR ULTIMO");
		Lista lista = new Lista();
		lista.insertarUltimo(10);
		lista.insertarUltimo(20);
		System.out.println(String.format("Primero es 10: %d, ultimo es 20: %d. Conteo 2: %d", 
				lista.getPrimero(), lista.getUltimo(), lista.getConteo()));
	}
	
	public static void testEliminarPrimero() {
		int eliminado1, eliminado2, eliminado3;
		
		System.out.println("PRUEBAS LA FUNCION ELIMINAR PRIMERO");
		Lista lista = new Lista();
		lista.insertarPrimero(10);
		lista.insertarPrimero(20);
		lista.insertarUltimo(30);
		
		eliminado1 = lista.eliminarPrimero();
		
		System.out.println(String.format("Primero es 10: %d, ultimo es 30: %d,"
				+ " eliminado 20: %d. Conteo 2: %d", 
				lista.getPrimero(), lista.getUltimo(), eliminado1, lista.getConteo()));
		
		eliminado2 = lista.eliminarPrimero();
		eliminado3 = lista.eliminarPrimero();
		
		System.out.println(String.format("Conteo 0: %d, eliminado 30: %d", 
				lista.getConteo(), eliminado3));
	}
	
	public static void testEliminarUltimo() {
		int eliminado1, eliminado2, eliminado3;
		
		System.out.println("PRUEBAS LA FUNCION ELIMINAR ULTIMO");
		Lista lista = new Lista();
		lista.insertarPrimero(10);
		lista.insertarPrimero(20);
		lista.insertarUltimo(30);
		
		eliminado1 = lista.eliminarUltimo();		
		System.out.println(String.format("Eliminando 30: %d", eliminado1));
		eliminado2 = lista.eliminarUltimo();
		System.out.println(String.format("Eliminando 10: %d", eliminado2));
		eliminado3 = lista.eliminarUltimo();
		System.out.println(String.format("Eliminando 20: %d", eliminado3));
	}
}
