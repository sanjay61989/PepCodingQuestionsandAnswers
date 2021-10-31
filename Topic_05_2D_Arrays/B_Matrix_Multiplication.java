package Topic_05_2D_Arrays;

import java.util.*;

public class B_Matrix_Multiplication {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		/* Matrix 1 Input */
		int r1 = scn.nextInt();
		int c1 = scn.nextInt();
		int[][] a = new int[r1][c1];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = scn.nextInt();
			}
		}
		/* Matrix 2 Input */
		int r2 = scn.nextInt();
		int c2 = scn.nextInt();
		int[][] b = new int[r2][c2];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				b[i][j] = scn.nextInt();
			}
		}

		if (c1 != r2) {
			System.out.println("Invalid input");
			return;
		}

		int[][] prd = new int[r1][c2];
		for (int i = 0; i < prd.length; i++) {
			for (int j = 0; j < prd[0].length; j++) {
				for (int k = 0; k < c1; k++) {
					prd[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		display2dArray(prd);
	}

	private static void display2dArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}