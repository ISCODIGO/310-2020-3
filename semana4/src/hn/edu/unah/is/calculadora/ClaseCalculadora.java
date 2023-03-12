package hn.edu.unah.is.calculadora;

public class ClaseCalculadora {
    public static void main(String[] args) {
        InterfazCalculadora suma = (double x, double y) -> {
            return y + x;
        };

        InterfazCalculadora divida = (a, b) -> a / b;
        InterfazCalculadora multiplica = (a, b) -> a * b;
        InterfazCalculadora potencia = (a, b) -> Math.pow(a, b);

        System.out.println(potencia.calcular(2, 3));
        System.out.println(multiplica.calcular(4, 5));
    }
}
