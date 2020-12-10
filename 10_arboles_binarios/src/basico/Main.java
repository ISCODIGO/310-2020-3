package basico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Arbol bin = new Arbol();
		LinkedList<Character> listaPreorden;
		LinkedList<Character> listaEnorden;
		LinkedList<Character> listaPostorden;
		
		Nodo A = bin.agregar('A');
		Nodo B = bin.agregar('B', A);
		Nodo C = bin.agregar('C', A);
		Nodo D = bin.agregar('D', B);
		Nodo E = bin.agregar('E', B);
		Nodo F = bin.agregar('F', C);
		Nodo H = bin.agregar('H', D);
		Nodo I = bin.agregar('I', D);
		
		System.out.println(String.format("Cantidad de nodos %d == %d", 
				bin.getSize(), bin.calcularNodos()));
		
		System.out.println("Recorrido pre-orden...");
		listaPreorden = (LinkedList<Character>)bin.preorden();
		System.out.println(Arrays.toString(listaPreorden.toArray()));
		
		System.out.println("Recorrido en-orden...");
		listaEnorden = (LinkedList<Character>)bin.enorden();
		System.out.println(Arrays.toString(listaEnorden.toArray()));
		
		System.out.println("Recorrido post-orden");
		listaPostorden = (LinkedList<Character>)bin.postorden();
		System.out.println(Arrays.toString(listaPostorden.toArray()));
	}
}
