public class Main {
    public static void main(String[] args) {
        int x;  // declaracion
        x = 10;  // inicializacion

        int y = 20;  // declaracion e inicializacion

        /*
        boolean ->  : 1 bit (true, false)
        enteros
            byte : 8 bits (-2^7 ---> 2^7-1)
            short : 16 bits (-2^15 --> 2^15 - 1)
            int : 32 bits (-2^31 --> 2^31 - 1)
            long : 64 bits
            char : 16 bits (0 --> 2^16 - 1)
        flotantes
            float : 32 bits
            double : 64 bits

        Los literales por defecto son: int y double
        */

        int i = 10;
        byte b = 8;

        i = b;  // conversion implicita

        int i2 = 129;
        byte b2 = (byte) i2;  // conversion explicita / casting

        int i3 = 1234;
        long l1 = i3;
        System.out.println(l1);

        b2 = 14;
        char c1 = (char) b2;
        System.out.println(c1);

        long l2 = 324324525;
        float f1 = l2;

        double d1 = 23.999999;
        int i4 = (int) d1;
        System.out.println(i4);

        float f4 = (float) 3.14;

        // se puede colocar una F para definir un literal float
        float f5 = 3.4665F;

        // se puede agregar un sufijo L para tener un literal long
        long l4 = 4_000_000_000L;

        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);

    }
}