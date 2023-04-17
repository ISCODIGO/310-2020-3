public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                for (int k = 0; k < 10000; k++) {
                    Thread.sleep(10);
                }
            }
        }
        System.out.println("Hello world!");
    }
}