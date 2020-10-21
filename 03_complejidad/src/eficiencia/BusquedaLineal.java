package eficiencia;

public class BusquedaLineal {	
	public static int buscar(int[] valores, int buscado) {
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] == buscado) {
				return i;
			}
		}
		
		return -1;
	}
}
