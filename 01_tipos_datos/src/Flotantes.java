
public class Flotantes {
	public static void main(String[] args) {
		// Problemas con la precision de los flotantes
		System.out.println("\nIncrementando en un float...");
		float valFloat = 3.1471f;
		
		for (int i = 0; i < 10; i++) {
			System.out.println(valFloat);
			valFloat += 0.001f;
		}
		
		System.out.println("\nIncrementado en un double..");
		double valDouble = 3.145;
		
		for (int i = 0; i < 10; i++) {
			System.out.println(valDouble);
			valDouble += 0.001;
		}
	}
}
