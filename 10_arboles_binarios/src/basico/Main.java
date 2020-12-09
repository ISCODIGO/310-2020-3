package basico;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Arbol bin = new Arbol();
		ArrayList<Character> listaPreorden;
		ArrayList<Character> listaEnorden;
		ArrayList<Character> listaPostorden;
		
		Nodo A = bin.agregar('A');
		Nodo B = bin.agregar('B', A);
		Nodo C = bin.agregar('C', A);
		Nodo D = bin.agregar('D', B);
		Nodo E = bin.agregar('E', B);
		Nodo F = bin.agregar('F', C);
		Nodo H = bin.agregar('H', D);
		Nodo I = bin.agregar('I', D);
		
		System.out.println("Recorrido pre-orden...");
		listaPreorden = (ArrayList<Character>)bin.preorden();
		System.out.println(Arrays.toString(listaPreorden.toArray()));
		
		System.out.println("Recorrido en-orden...");
		listaEnorden = (ArrayList<Character>)bin.enorden();
		System.out.println(Arrays.toString(listaEnorden.toArray()));
		
		System.out.println("Recorrido post-orden");
		listaPostorden = (ArrayList<Character>)bin.postorden();
		System.out.println(Arrays.toString(listaPostorden.toArray()));
	}
}
