import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int num = sc.nextInt();
        sc.close();

        // Ejemplo de bucle "while"
        System.out.println("Bucle \"while\":");
        int contador = 1;

        while (contador <= num) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // Ejemplo de bucle "do-while"
        System.out.println("Bucle \"do-while\":");
        contador = 1;
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= num);
    }
}
