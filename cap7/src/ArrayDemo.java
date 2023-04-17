import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = new int[3];  // mas legible
        int b[] = new int[3];

        a[0] = 10;
        a[1] = 2;
        a[2] = 34;

        System.out.println(Arrays.toString(a));

        int[] c = {10, 2, 34};
        System.out.println(Arrays.toString(c));

        b = a;
        b[1] = 22;

        System.out.println(a.equals(b));
        System.out.println(Arrays.toString(a));

        duplicar(c);
        System.out.println(Arrays.toString(c));

        int x = 10;
        duplicar(x);
        System.out.println(x);
    }

    static void duplicar(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

    static void duplicar(int a) {
        a *= 2;
    }
}
