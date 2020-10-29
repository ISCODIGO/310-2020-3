package suma;

import cronometro.Cronometro;

public class MainSumaEnteros {
	public static void main(String[] args) {
		int N = 10_000;
		
		System.out.println("Iterativo...");
		Cronometro crono1 = new Cronometro();		
		System.out.println(SumaEnterosIterativo.sumar(N));
		crono1.finalizar();
		System.out.println(crono1);
		
		System.out.println("\nRecursivo...");
		Cronometro crono2 = new Cronometro();
		System.out.println(SumaEnterosRecursivo.sumar(N));
		crono2.finalizar();
		System.out.println(crono2);
		
		System.out.println("\nRecursivo (tail)...");
		Cronometro crono3 = new Cronometro();
		System.out.println(SumaEnterosTailRecursivo.sumar(N));
		crono3.finalizar();
		System.out.println(crono3);		
		
		System.out.println("\nEficiente...");
		Cronometro crono4 = new Cronometro();
		System.out.println(SumaEnterosEficiente.sumar(N));
		crono4.finalizar();
		System.out.println(crono4);
	}
}
