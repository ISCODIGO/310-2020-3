/**
 * Crear un TDA que defina las operaciones de un conjunto (set).
 * Se almacenan valores únicos.
 * Serán enteros (en este caso).
 * Operaciones: union, interseccion, complemento.
 */

import java.util.Arrays;

class Conjunto {
 // atributos = datos o variables
  private boolean[] universo;
  
 // operaciones = funciones
  
  // constructor
  public Conjunto(int size) {
    this.universo = new boolean[size + 1];    
  }
  
  public void agregar(int valor) {
    this.universo[valor] = true;
  }
  
  public void remover(int valor) {
    this.universo[valor] = false;
  }
  
  public Conjunto union(Conjunto otro) {
    Conjunto resultado = new Conjunto(this.universo.length);
    
    // tener todos los elementos de un conjunto y del otro
    for (int i = 0; i < this.universo.length; i++) {
      if (otro.universo[i] || this.universo[i]) {
        resultado.universo[i] = true;
      }
    }
    
    return resultado;
  }
  
  public String toString() {
    String resultado;
    
    resultado = "{";
    
    for (int i = 0; i < this.universo.length; i++) {
       if (this.universo[i]) {
         resultado += i + ",";
       }
    }
    
    resultado += "}";
    
    return resultado;
  }
}
