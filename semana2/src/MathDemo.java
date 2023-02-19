public class MathDemo {
    public static void main(String[] args) {
        /*

        <-----------------|-------
                         3.6

        java.lang

        condicion ? verdadera : falsa

        ==
        !=
        >
        <
        >=
        <=

        sqrt(2) -> 1.4142135623730951
        sqrt(2) -> 1.4142135

         */
        double ceilEjemplo = Math.ceil(3.6);
        System.out.println(ceilEjemplo);

        double floorEjemplo = Math.floor(3.6);
        System.out.println(floorEjemplo);

        int x = 10;
        int y = 11;
        int z = 13;

        System.out.println("Maximo es: " + Math.max(x, y));
        System.out.println("Minimo es: " + Math.min(x, y));

        int valorMinimo = Math.min(Math.min(x, y), z);
        System.out.println(valorMinimo);

        float raizCuadrada = (float) Math.sqrt(2);
        System.out.println(raizCuadrada);

        float siguienteFloat = Math.nextUp(raizCuadrada);
        System.out.println("Siguiente float es: " + siguienteFloat);
        System.out.println("Anterior float es: " + Math.nextDown(raizCuadrada));


        double raizCuadradaD = (float) Math.sqrt(2);
        System.out.println(raizCuadradaD);

        double siguienteDouble = Math.nextUp(raizCuadradaD);
        System.out.println("Siguiente double es: " + siguienteDouble);

        float f1 = 1.4142136f;
        System.out.println(f1);
    }
}
