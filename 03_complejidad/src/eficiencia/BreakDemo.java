package eficiencia;

public class BreakDemo {
	public static void main(String[] args) {
		int col = 2;
		int row = 2;
		int[][] matriz = {{1, 2}, {2, 3}};
		int total = 0;
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				if (j > 0) {
					break;
				} else {
					total += matriz[i][j];
				}
			}
		}
		//return total;
		System.out.println(total);
	}
}
