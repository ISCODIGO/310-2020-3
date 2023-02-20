public class Cortocircuito {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        // en este caso no evalua la segunda parte de la condicion
        if (x < 0 && x / y > 0) {
            System.out.println("OK");
        }
    }
}
