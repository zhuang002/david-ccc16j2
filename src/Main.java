import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] square = new int[4][4];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<4; i++) {
			for (int j=0;j<4;j++) {
				square[i][j] = sc.nextInt();
			}
		}
		
		int targetSum = -1;
		
		for (int row=0;row<4;row++) {
			// i is the row number;
			int sum = sumuprow(row,square);
			if (targetSum == -1) {
				targetSum = sum;
			}
			
			if (sum != targetSum) {
				System.out.println("not magic");
				return;
			}
		}
		
		for (int col=0;col<4;col++) {
			int sum = sumupcol(col, square);
			if (sum != targetSum) {
				System.out.println("not magic");
				return;
			}
		}
		
		System.out.println("magic");

	}

	private static int sumupcol(int col, int[][] square) {
		int sum = 0;
		for (int row=0;row<4;row++) {
			sum += square[row][col];
		}
		return sum;
	}

	private static int sumuprow(int row, int[][] square) {
		int sum = 0;
		for (int col=0;col<4;col++) {
			sum += square[row][col];
		}
		return sum;
	}

}
