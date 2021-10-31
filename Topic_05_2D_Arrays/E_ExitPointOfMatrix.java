package Topic_05_2D_Arrays;

import java.util.Scanner;

public class E_ExitPointOfMatrix {
	public static void main(String[] args) {
		int[][] a = takeInput();
		int dir = 0;
		int i = 0, j = 0;
		while (true) {
			dir = (dir + a[i][j]) % 4;
			if (dir == 0) {
				j++;
			} else if (dir == 1) {
				i++;
			} else if (dir == 2) {
				j--;
			} else if (dir == 3) {
				i--;
			}
			if (i < 0) {
				i++;
				break;
			} else if (j < 0) {
				j++;
				break;
			} else if (i == a.length) {
				i--;
				break;
			} else if (j == a[0].length) {
				j--;
				break;
			}
		}
		System.out.println(i);
		System.out.println(j);
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
