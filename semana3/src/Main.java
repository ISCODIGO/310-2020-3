import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        String s = "hola";
        String t = new String("hola");
        String u = "hola";
        Scanner entrada = new Scanner(System.in);



        System.out.println(s);
        System.out.println(t);
        System.out.println("==" + (s==t));
        System.out.println("equals" + s.equals(t));
    }
}

/*
Stack           Heap
x=10               100: "hola"
s=100               120: new String("hola")
t=120               130: new Scanner...
u=100
entrada=130

Condiciones boolean
- operadores de comparacion
    ==
    !=
    <
    >
    <=
    >=
- cualquier elemento que devuelva un boolean
    variables
    funciones con retorno boolean


 */