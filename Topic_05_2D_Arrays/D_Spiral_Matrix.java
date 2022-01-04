package Topic_05_2D_Arrays;

import java.util.Scanner;

public class D_Spiral_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = takeInput();
		int minr = 0, minc = 0, maxr = a.length - 1, maxc = a[0].length - 1;
		int totalCount = a.length * a[0].length;
		int count = 0;
		while (count != totalCount) {
			for (int i = minr, j = minc; i <= maxr && count != totalCount; i++) {
				print(a[i][j]);
				count++;
			}
			minc++;
			for (int i = maxr, j = minc; j <= maxc && count != totalCount; j++) {
				print(a[i][j]);
				count++;
			}
			maxr--;
			for (int i = maxr, j = maxc; i >= minr && count != totalCount; i--) {
				print(a[i][j]);
				count++;
			}
			maxc--;
			for (int i = minr, j = maxc; j >= minc && count != totalCount; j--) {
				print(a[i][j]);
				count++;
			}
			minr++;
		}
	}

	private static void print(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
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