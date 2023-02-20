/*

La segunda version es mas reducida. Ademas que se corrigen algunos pasos de la
primera version para hacerlo acortarlo mas.

 */
import java.util.Scanner;

public class EmailDemoV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Colocar un email para validar: ");
        String email = entrada.next();

        if (email == null || email.length() < 5) {
            System.out.println("Email invalido");
            return;
        }

        String[] partesArroba = email.split("@");
        if (partesArroba.length != 2 ){
            System.out.println("Debe existir una arroba");
            return;
        }

        if (partesArroba[0].length() == 0) {
            System.out.println("Falta usuario");
            return;
        }

        String[] parteDominio = partesArroba[1].split("\\.");
        if (parteDominio.length < 2) {
            System.out.println("No hay dominio/subdominio");
            return;
        }

        if (parteDominio[0].length() == 0 || parteDominio[1].length() == 0) {
            System.out.println("No hay dominio/subdominio");
            return;
        }

        System.out.println("Correo valido");
    }
}