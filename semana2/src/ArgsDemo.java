/*

Para introducir datos a un programa normalmente se utilizan los argumentos del
metodo main (el array de tipo String).

Normalmente se usa cuando se ejecuta un programa el esquema es de la siguiente
forma:

programa arg0 arg1 arg2

Cada argumento esta separado por un espacio en blanco. Pero si el argumento es
una frase de varias palabras se puede hacer utilizando comillas dobles. Por
ejemplo: "hola mundo" seria un solo argumento.

 */
public class ArgsDemo {
    public static void main(String[] args) {
        /*
        Objetivo: Imprime un mensaje (args[0]) N veces (args[1])

        El siguiente programa puede fallar de multiples formas:
        - Puede que no existan dos elementos en el array: ArrayIndexOutOfBoundsException
        - Puede que no se pueda parsear a un entero el String: NumberFormatException
        */

        String mensaje = args[0];
        int n = Integer.parseInt(args[1]);

        for(int i = 1; i <= n; i++) {
            System.out.println(mensaje);
        }
    }
}
