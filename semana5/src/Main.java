public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        double pi = Math.PI / 10_000;
        System.out.println("La suma de " + a + " + " + b + " es " + c);
        System.out.printf("La suma de %d + %d es %d%n", a, b, c);
        System.out.printf("El valor hexadecimal de %d es %x%n", b, b);
        System.out.printf("La notacion cientifica de %f es %e%n", pi, pi);

        double sueldo = 19015.9955654764;
        System.out.printf("La persona gana L%-15.2f%n", sueldo);
        System.out.printf("La persona gana L%-15.2f%n", 110123.14);

        String sf = String.format("La persona gana L%15.2f%n", sueldo);
        System.out.println(sf);
    }
}

/*
L       19016.00
 */