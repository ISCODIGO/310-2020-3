public class MultiplesArgumentos {

    public static int sumar(int... variables)
    {
        int acc = 0;
        for (int x : variables) {
            acc += x;
        }
        return acc;
    }

    public static double multiplicarSuma(double m, int... valores) {
        // Suma todos los valores y el resultado lo multiplica con m
        // multiplicarSuma(2.0, 1, 2, 3) -> 12.0
        return m * sumar(valores);
    }
    public static void main(String[] args) {
        assert sumar(3, 4) == 7;
        assert sumar(1) == 1;
        assert sumar(10, 20, 1) == 31;
        assert sumar(1, 2, 3, 4) == 10;
        assert sumar() == 0;

        System.out.println(multiplicarSuma(2.0, 1, 2, 3));
    }
}

// sumar(1, 2)
// sumar(1, 2, 3)
// sumar(1, 2, 3, 4)
