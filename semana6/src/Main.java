import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Dado dado1 = new Dado();
        for (int i = 0; i < 30; i++) {
            dado1.lanzar();
            System.out.println(dado1.getCara());
        }
        dado1.imprimirHistoria();

        Dado dado2 = new Dado();
        dado2.lanzar();

        System.out.printf("Dado 1: %d, Dado 2: %d%n", dado1.getCara(), dado2.getCara());

        int comparacion = dado1.compareTo(dado2);
        switch (comparacion) {
            case -1 -> System.out.println("dado 1 < dado 2");
            case 0 -> System.out.println("son iguales");
            case 1 -> System.out.println("dado 1 > dado 2");
        }

        System.out.println("Uso de equals");
        System.out.println(dado1.equals(dado2));
    }
}