import java.util.Scanner;

public class NextDemo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner("hola esta es la clase de programacionn II");
        System.out.print("Primera palabra: ");
        String s1 = entrada.next();
        // para limpiar de cualquier token sin utilizar
        //entrada.nextLine();
        System.out.print("Segunda palabra: ");
        String s2 = entrada.next();

        System.out.println(s1);
        System.out.println(s2);

    }
}
