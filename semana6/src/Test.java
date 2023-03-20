import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float celsius;
        double fahrenheit;

        System.out.println("Ingrese una temperatura en grados celsius: ");
        celsius = entrada.nextInt();

        fahrenheit = (celsius * 1.8) + 32;

        System.out.println("Los grados fahrenheit es: " + fahrenheit);

        if (fahrenheit <= 32){
            System.out.println("La temperatura esta cerca del punto de congelaciòn del agua.");
        } else if () {

        }
    }
}
