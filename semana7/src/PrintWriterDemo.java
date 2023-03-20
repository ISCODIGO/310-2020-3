import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("salida.txt");
        printWriter.println("Hola mundo");
        printWriter.println("Segundo parrafo");

        for (int i = 0; i < 100; i++) {
            printWriter.print(i+"-");
        }
        printWriter.close();
    }
}
