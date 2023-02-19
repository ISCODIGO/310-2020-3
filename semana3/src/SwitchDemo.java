public class SwitchDemo {
    public static void main(String[] args) {
        int x = 0;

        switch (x) {
            case 0 -> {
                System.out.println("Es cero");
                System.out.println("No hay nada");
            }
            case 1 ->
                    System.out.println("Es uno");
            default ->
                    System.out.println("No valido");
        }
    }
}
