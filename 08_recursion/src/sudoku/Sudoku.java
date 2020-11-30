/*
 * Ejemplo de backtracking. Como resolver un sudoku.
 * Fuente: https://www.geeksforgeeks.org/sudoku-backtracking-7/
 */
package sudoku;

public class Sudoku {

	// Tamaño del tablero
    private int N;
    private int vueltaAtras;
    private int[][] mapa;
    
    public Sudoku(int[][] mapa) {
    	this.mapa = mapa;
    	this.N = mapa.length;
    	this.vueltaAtras = 0;
    }
    
    public int contarBacktracking() {
    	return this.vueltaAtras;
    }
    
    public boolean resolver() {
    	return resolver(0, 0);
    }
 
    public boolean resolver(int fila, int columna) {
    	// Caso base: Regresar si se llega a los extremos    	
        if (fila == this.N - 1 && columna == this.N) {
            return true;
        }
 
        // Si la columna llega al limite pasa a la siguiente fila
        // y la columna vuelve a cero.
        if (columna == this.N) {
            fila++;
            columna = 0;
        }
 
        // Revisar si la posicion actual no es cero inicia la recursion en la
        // siguiente columna.
        if (mapa[fila][columna] != 0) {
            return resolver(fila, columna + 1);
        }
 
        for (int num = 1; num <= 9; num++) {
            // Prueba si es posible agregar un valor entre 1 y 9 en las 
        	// coordenadas actuales. En caso que sea posible se mueve a la 
        	// siguiente columna.
            if (esPermitido(fila, columna, num)) {
            	mapa[fila][columna] = num;
 
                // Caso progresivo: Intenta con la sigiuente columna
                if (resolver(fila, columna + 1)) {
                    return true;
                }
            }
            
            // En caso de que no sea permitido se elimina el valor anterior,
            // aqui ocurre la vuelta atras (backtracking)
            mapa[fila][columna] = 0;
            vueltaAtras++;
        }
        return false;
    }
 
    // Funcion para imprimir el tablero
    public void imprimir()
    {
        for (int i = 0; i < this.N; i++) {
            for (int j = 0; j < this.N; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
    }
 
    // Funcion que permite revisar si esta permitido colocar un numero dentro 
    // de la posicion indicada del tablero.
    private boolean esPermitido(int fila, int columna, int numero)
    {
        // Si el numero ya existe en la misma columna retornar false.   
        for (int x = 0; x < N; x++) {
            if (mapa[fila][x] == numero) {
                return false;
            }
        }
 
        // Si el numero ya existe en la misma fila retornar false.
        for (int x = 0; x < N; x++) {
            if (mapa[x][columna] == numero) {
                return false;
            }
        }
 
        // Si el numero ya existe en la misma matriz de 3x3 retornar false.
        int filaInicial = fila - fila % 3;
        int columnaInicial = columna - columna % 3;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mapa[i + filaInicial][j + columnaInicial] == numero) {
                    return false;
                }
            }
        }
 
        // Si los anteriores casos no se cumplen retornar true. Es permitido.
        return true;
    }
}
