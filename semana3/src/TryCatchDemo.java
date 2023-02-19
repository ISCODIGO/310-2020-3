public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("Inicio de programa");
        int x = 10;
        int y = 0;

        try {
            System.out.println(x / y);
        } catch (Exception e) {
            System.out.println("Fallo algo:");
            e.printStackTrace();
        }
        System.out.println("Fin del programa");
    }
}
