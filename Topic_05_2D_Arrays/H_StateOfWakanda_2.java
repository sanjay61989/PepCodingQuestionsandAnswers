package Topic_05_2D_Arrays;

import java.util.Scanner;

public class H_StateOfWakanda_2 {

	public static void main(String[] args) {
		/* Matrix 1 Input */
		int a[][] = takeInput();
		for (int g = 0; g < a.length; g++) {
			for (int i = 0, j = g; j < a.length; i++, j++) {
				System.out.println(a[i][j]);
			}
		}
	}

	private static int[][] takeInput() {
		Scanner scn = new Scanner(System.in);
		int r1 = scn.nextInt();
//		int c1 = scn.nextInt();
		int[][] a = new int[r1][r1];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = scn.nextInt();
			}
		}
		return a;
	}

}
