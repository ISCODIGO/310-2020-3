import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {

    static double generarPromedio(String archivo) throws FileNotFoundException {
        File file = new File(archivo);
        Scanner scanner = new Scanner(file);

        int total = 0;
        int conteo = 0;
        while (scanner.hasNextInt()) {
            total += scanner.nextInt();
            conteo++;
        }

        return (double) total / conteo;
    }
    public static void main(String[] args) {
        double resultado = 0;
        try {
            resultado = generarPromedio("datos.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(resultado);
    }
}