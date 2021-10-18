package Day_08_Arrays_Part_1;

import java.util.Scanner;

public class C_InvertedBarChartUsingArrays {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		printBarChart(a);
	}

	private static void printBarChart(int[] a) {
		int max = findMax(a);
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i < a[j]) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

	private static int findMax(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}
}