public class Test {
    public static void main(String[] args) {
        String email = "z";

        String[] partes = email.split("\\.");
        System.out.println(partes.length);
        System.out.println(partes[1]);
    }
}
