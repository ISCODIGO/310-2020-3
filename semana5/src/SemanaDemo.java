public class SemanaDemo {
    public static void main(String[] args) {
        Semana dia = Semana.LUNES;
        System.out.println(dia);

        if (dia == Semana.SABADO || dia == Semana.DOMINGO) {
            System.out.println("Estamos en fin de semana...");
        } else {
            System.out.println("Es dia laboral");
        }

    }
}
