package laberinto;

public class Main {
    public static void main(String args[]) 
    {         
        int tablero[][] = { 
    		{ 1, 1, 1, 1, 1, 0, 1, 0 }, 
            { 1, 0, 0, 0, 0, 0, 1, 0 }, 
            { 1, 1, 1, 1, 1, 1, 1, 0 }, 
            { 1, 1, 1, 1, 1, 1, 1, 0 },
            { 0, 0, 1, 1, 0, 0, 0, 0 },
            { 0, 0, 1, 1, 1, 0, 0, 0 },
            { 1, 1, 1, 1, 1, 1, 0, 0 },
            { 1, 0, 0, 0, 1, 1, 1, 1 },
        };
        
        Laberinto laberinto = new Laberinto(tablero);
        System.out.println("Tablero original");
        laberinto.imprimir(tablero);
        
        System.out.println("Tablero resuelto");
        laberinto.resolver(); 
    } 
}
