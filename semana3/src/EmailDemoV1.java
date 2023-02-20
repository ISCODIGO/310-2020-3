import java.util.Scanner;

public class EmailDemoV1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Colocar un email para validar: ");
        String email = entrada.next();

        if (email == null || email.length() < 5) {
            System.out.println("Email muy corto/inexistente");
        } else {
            // email con longitud minima
            int posicionArroba = email.indexOf('@');
            if (posicionArroba <= 0) {
                System.out.println("Posicion de @ invalido");
            } else {
                // corroborar punto
                int ultimaPosicionPunto = email.lastIndexOf('.');
                if (ultimaPosicionPunto == -1) {
                    System.out.println("Falta .");
                } else if (ultimaPosicionPunto < posicionArroba) {
                    System.out.println(". va antes del @");
                } else {
                    // hay un punto
                    // hay una arroba
                    // el punto esta despues del arroba
                    String[] partesArroba = email.split("@");
                    if (partesArroba.length > 2) {
                        System.out.println("Multiples apariciones de @");
                    } else if (partesArroba[0].length() == 0) {
                        System.out.println("Falta usuario");
                    } else if (partesArroba[1].length() == 0) {
                        System.out.println("Falta subdominio/dominio");
                    } else {
                        // hay datos en dominio/subdominio
                        String[] partesPunto = partesArroba[1].split("\\.");
                        if (partesPunto.length >= 2) {
                            if (partesPunto[0].length() == 0 || partesPunto[1].length() == 0) {
                                System.out.println("Subdominio/Dominio invalidos");
                            } else {
                                System.out.println("Correo valido");
                            }
                        } else {
                            System.out.println("Falta dominio/subdominio");
                        }
                    }
                }
            }
        }
    }
}

/*

String n = null;
String e = "";

Stack           Heap
n               100: ""
e=100
 */