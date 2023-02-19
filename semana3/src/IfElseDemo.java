import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribir entero: ");
        int x = entrada.nextInt();

        if (x % 2  == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Impar");
        }

        System.out.println("Fin");
    }
}
