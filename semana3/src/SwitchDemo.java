public class SwitchDemo {
    public static void main(String[] args) {
        int x = 0;

        // este es el metodo alternativo de switch
        switch (x) {
            case 0 -> {
                System.out.println("Es cero");
                System.out.println("No hay nada");
            }
            case 1 -> System.out.println("Es uno");
            case 2 -> System.out.println("Es dos");
            default -> System.out.println("No valido");
        }
    }
}
