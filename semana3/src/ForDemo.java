public class ForDemo {
    public static void main(String[] args) {
        String s = "hola mundo";

        for(int i = 0; i < s.length(); i++){
            System.out.println(i+" -> "+s.charAt(i));
        }

        for(char caracter: s.toCharArray()) {
            System.out.print(caracter + "-");
        }
    }
}
