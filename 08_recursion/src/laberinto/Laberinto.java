/*
 * Resolucion de un laberinto utilizando backtracking.
 * Fuente: https://www.geeksforgeeks.org/rat-in-a-maze-backtracking-2/
 */
package laberinto;

public class Laberinto {
    private int N; 
    private int[][] tablero;
    
    public Laberinto(int[][] matriz) {
    	this.tablero = matriz;
    	this.N = matriz.length;
    }
  
    void imprimir(int[][] matriz) { 
        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < N; j++) 
                System.out.print(" " + matriz[i][j] + " "); 
            System.out.println(); 
        } 
    } 
  
    private boolean esPermitido(int x, int y) { 
        return (x >= 0 && x < N && y >= 0 && y < N && tablero[x][y] == 1); 
    } 
  
    boolean resolver() { 
    	// Este arreglo es un simil del original, pero guarda solamente el 
    	// recorrido generado.
        int solucion[][] = new int[N][N]; 
  
        if (resolverRecursivo(0, 0, solucion) == false) { 
            System.out.print("No existe la solucion"); 
            return false; 
        } 
  
        imprimir(solucion); 
        return true; 
    } 
  
    private boolean resolverRecursivo(int x, int y, int sol[][]) 
    {
    	// Caso base: Llegar a la meta
        if (x == N - 1 && y == N - 1 && this.tablero[x][y] == 1) { 
            sol[x][y] = 2; 
            return true; 
        } 
  
        if (esPermitido(x, y) == true) { 
            sol[x][y] = 2; 
  
            // Avanzar por x (ir hacia la derecha)
            if (resolverRecursivo(x + 1, y, sol)) { 
                return true;
            }
  

            // Avanzar por y (ir hacia abajo)
            if (resolverRecursivo(x, y + 1, sol)) {
                return true;
            }
  
            // Si no funcionan los movimientos entonces ir hacia atras.
            sol[x][y] = 0; 
            return false; 
        } 
  
        return false; 
    } 
  
}
