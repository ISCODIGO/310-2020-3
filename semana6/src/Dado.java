import java.util.Arrays;
import java.util.Random;

public class Dado implements Comparable<Dado> {
    private int lados;
    private int cara;
    private int[] historia;

    public int getCara() {
        return cara;
    }

    private void setCara(int cara) {
        this.cara = cara;
    }

    public void lanzar() {
        Random random = new Random();
        this.cara = random.nextInt(this.lados) + 1;
        this.historia[this.cara]++;
    }

    public Dado(int lados) {
        this.lados = lados;
        this.historia = new int[this.lados + 1];
    }

    public Dado() {
        this(6);
    }

    public void imprimirHistoria() {
        System.out.println(Arrays.toString(this.historia));
    }


    @Override
    public int compareTo(Dado o) {
        if (this.cara == o.cara) {
            return 0;
        } else if (this.cara > o.cara) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dado) {
            Dado otro = (Dado) obj;
            return this.cara == otro.cara;
        }
        return false;
    }
}
