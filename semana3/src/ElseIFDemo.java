import java.util.Scanner;

public class ElseIFDemo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Solicitar edad: ");
        int edad = entrada.nextInt();

        // evaluacion 1
        System.out.println("Segun la pelicula Midsommar usted esta...");
        if (edad < 0) {
            System.out.println("Edad negativa?");
        } else if (edad <= 18) {
            System.out.println("Infante");
        } else if (edad <= 36) {
            System.out.println("Joven");
        } else if (edad <= 54) {
            System.out.println("Adulto");
        } else if (edad <= 72) {
            System.out.println("Consejero");
        } else {
            System.out.println("Muerto");
        }

        // evaluacion 2: es independiente de la primera
        if (edad % 2 == 0) {
            System.out.println("Edad par");
        }
    }
}
