import hn.edu.unah.is.calculadora.InterfazCalculadora;
public class PackageDemo {
    public static void main(String[] args) {
        // llamar a la interfaz calculadora
        hn.edu.unah.is.calculadora.InterfazCalculadora suma = (a, b) -> a + b;
        InterfazCalculadora rest = (a, b) -> a - b;
    }
}
