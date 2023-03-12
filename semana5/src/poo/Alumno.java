package poo;

public class Alumno {
    // atributos
    String cuenta;
    String nombres;
    double[] notas;

    // metodos
    public Alumno(String cuenta, String nombres) {
        this.cuenta = cuenta;
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", this.nombres, this.cuenta);
    }
}
