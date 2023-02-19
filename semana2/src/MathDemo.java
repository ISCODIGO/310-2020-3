public class MathDemo {
    public static void main(String[] args) {
        /*
        java.lang -> es el package por defecto no necesita importarse

        condicion ? verdadera : falsa
         */
        double ceilEjemplo = Math.ceil(3.6);
        System.out.println("Math.ceil(3.6) = " + ceilEjemplo);

        double floorEjemplo = Math.floor(3.6);
        System.out.println("Math.floor(3.6) es " + floorEjemplo);

        int x = 10;
        int y = 11;
        int z = 13;

        System.out.println("Maximo de 10 y 11 es " + Math.max(x, y));
        System.out.println("Minimo de 10 y 11 es " + Math.min(x, y));

        int valorMinimo = Math.min(Math.min(x, y), z);
        System.out.println("Minimo de 10, 11 y 13 es " + valorMinimo);

        float raizCuadrada = (float) Math.sqrt(2);
        System.out.println("Raiz cuadrada de 2 (float) es " + raizCuadrada);

        System.out.println("Siguiente float es: " + Math.nextUp(raizCuadrada));
        System.out.println("Anterior float es: " + Math.nextDown(raizCuadrada));


        double raizCuadradaD = Math.sqrt(2);
        System.out.println("Raiz cuadrada de 2 (double) es " + raizCuadradaD);

        double siguienteDouble = Math.nextUp(raizCuadradaD);
        System.out.println("Siguiente double es: " + siguienteDouble);

        float f1 = 1.4142136f;
        System.out.println("Intento representar 1.4142136 pero aparece " + f1);
    }
}
