/*

El bloque try-catch sirve para manejar excepciones (en caso que ocurran generan
el cierre inesperado del programa). Consta de dos bloques:
- try: cuando se necesita colocar instrucciones que pueden generar una excepcion
    se colocan en ese bloque.
- catch: cuando ocurre la excepcion este bloque se ejecuta. Se utiliza para
    realizar alguna correcion o documentar el error ocurrido.

 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("Inicio de programa");
        int x = 10;
        int y = 0;

        try {
            System.out.println(x / y);
        } catch (Exception e) {
            System.out.println("Fallo algo:" + e.getMessage());  // muestra el mensaje
        }

        // se puede colocar la excepcion exacta
        try {
            System.out.println(x / y);
        } catch (ArithmeticException arithmeticException) {
            arithmeticException.printStackTrace();  // muestra un mensaje con mayor detalle
        }

        // es posible que si se coloca una excepcion especifica
        // puede aparecer otra y fallar
        int[] arr = new int[1];
        try {
            arr[10] = 0;  // esto genera otra excepcion
        }
        // este bloque no puede capturar otro tipo de excepcion
        catch (ArithmeticException arithmeticException) {
            System.out.println("Fallo algo:" + arithmeticException.getMessage());
        }
        // se ha comentado esto para generar un fallo en el programa
        /*catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Fallo algo: " + arrayIndexOutOfBoundsException);
        }*/
        System.out.println("Fin del programa");
    }
}
