package Topic_05_2D_Arrays;

import java.util.Scanner;

public class C_StateOfWakanda_1 {

	public static void main(String[] args) {
		/* Matrix 1 Input */
		int a[][] = takeInput();
		for (int i = 0; i < a[0].length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < a.length; j++) {
					System.out.println(a[j][i]);
				}
			} else {
				for (int j = a.length - 1; j >= 0; j--) {
					System.out.println(a[j][i]);
				}
			}
		}
	}

	private static int[][] takeInput() {
		Scanner scn = new Scanner(System.in);
		int r1 = scn.nextInt();
		int c1 = scn.nextInt();
		int[][] a = new int[r1][c1];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = scn.nextInt();
			}
		}
		return a;
	}

}
