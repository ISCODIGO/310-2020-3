import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        /*

        int x = 0;
        int -> tipo primitivo
        x -> variable
        0 -> literal

        String cadena = "hola";
        String -> clase
        cadena -> objeto
        "hola" -> objeto

        Scanner entrada = new Scanner();
        Scanner -> clase
        entrada -> objeto
        new Scanner() -> objeto


         */

        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba una palabra: ");

        // con next leemos un palabra (token)
        char palabra = entrada.next().charAt(0);
        System.out.println((char)(palabra + 1));
        System.out.println((int)'H');
    }
}
