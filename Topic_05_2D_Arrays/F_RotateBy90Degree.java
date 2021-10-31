package Topic_05_2D_Arrays;

import java.util.Scanner;

public class F_RotateBy90Degree {

	public static void main(String[] args) throws Exception {
		// write your code here
		int[][] a = takeInput();
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a[0].length; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		for (int i = 0; i < a.length; i++) {
			int li = 0;
			int ri = a[0].length - 1;
			while (li < ri) {
				int temp = a[i][li];
				a[i][li] = a[i][ri];
				a[i][ri] = temp;
				li++;
				ri--;
			}
		}
		display(a);
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
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