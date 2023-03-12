public class Main {
    public void funcionNoStatic() {
        System.out.println("Llamado a funcion no-static");
    }

    public static void funcionStatic() {
        System.out.println("Llamado a funcion static");
    }
    public static void main(String[] args) {
        funcionStatic();
        //funcionNoStatic();  // no es llamado por ser non-static
    }
}