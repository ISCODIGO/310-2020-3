
public class Wrapper {
	public static void main(String[] args) {
		// Valores limites de un tipo: Integer
		int valMax = Integer.MAX_VALUE;
		int valMin = Integer.MIN_VALUE;
		
		System.out.println(String.format("MAX_VALUE: %d", valMax));
		System.out.println(String.format("MIN_VALUE: %d", valMin));
		
		// Al intentar superar los limites se define un recorrido circular
		System.out.println(String.format("MAX_VALUE + 1: %d", valMax + 1));
		System.out.println(String.format("MIN_VALUE - 1: %d", valMin - 1));
				
	}
}
