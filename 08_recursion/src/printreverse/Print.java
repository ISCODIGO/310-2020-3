/*
 * Este ejercicio tiene como objetivo capturar por medio de Scanner flujo de 
 * texto. Sin embargo, el problema es que debe mostrarse en orden reverso de 
 * como fueron ingresados.
 */
package printreverse;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        System.out.println("Escriba una serie de lineas.\nPara finalizar deje una linea vacia");
        resolver(new Scanner(System.in));        
    }
    
	static void resolver(Scanner scan) {
        String str = scan.nextLine();

        // Caso progresivo. El caso base esta definido de forma implicita
        // cuando la cadena esta vacia.
        if (!str.equals("")) {
            resolver(scan);
        }
        System.out.println(str);
        scan.close();
    }
}
