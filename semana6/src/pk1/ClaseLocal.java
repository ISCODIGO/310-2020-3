package pk1;

public class ClaseLocal {
    public int atributoPublico;
    private int atributoPrivado;
    protected int atributoProtegido;
    int atributoDefault;

    public static void main(String[] args) {
        ClaseLocal cl = new ClaseLocal();
        cl.atributoPublico = 1;
        cl.atributoPrivado = 2;
        cl.atributoDefault = 3;
        cl.atributoProtegido = 4;
    }
}
