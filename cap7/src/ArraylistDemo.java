import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<>();  // inicializacion del obj.

        char letra = 'a';
        for (int i = 0; i < 26; i++) {
            cadenas.add(String.valueOf(letra++));  // agregar al arraylist
        }

        System.out.println(cadenas.size());

        //cadenas.remove()
        System.out.println(cadenas.get(2));
        

        ArrayList<Integer> enteros = new ArrayList<>();
        enteros.add(1);
        enteros.add(2);
        enteros.add(3);

        //enteros.remove(Integer.valueOf(2));
        Integer x = 2;
        enteros.remove(x);
    }
}
