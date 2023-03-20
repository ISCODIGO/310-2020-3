import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderDemo {
    static final String ARCHIVO = "ejemplo.txt";
    static void lecturaPorCaracter() throws IOException {
        FileReader fileReader = new FileReader(ARCHIVO);
        int c;
        int limite = 100;
        int contador = 0;
        do {
            contador++;
            c = fileReader.read();
            System.out.print((char)c);
        } while (c != -1 && contador < limite);
    }

    static void lecturaPorBuffer() throws IOException {
        FileReader fileReader = new FileReader(ARCHIVO);
        char[] buffer = new char[100];
        fileReader.read(buffer);
        System.out.println(new String((buffer)));
    }
    public static void main(String[] args) throws IOException {
        lecturaPorBuffer();
        lecturaPorCaracter();
    }
}
