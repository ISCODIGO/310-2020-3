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
        // Imprime n veces (args[1]) un mensaje (args[0])
        /*String mensaje = args[0];
        int n = Integer.parseInt(args[1]);

        for(int i = 1; i <= n; i++) {
            System.out.println(mensaje);
        }*/

        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba una palabra: ");

        // con next leemos un palabra (token)
        char palabra = entrada.next().charAt(0);
        System.out.println((char)(palabra + 1));
        System.out.println((int)'H');
    }
}
