package Day_9_Arrays_Part_2;

import java.util.*;

public class A_SumOfTwoArrays {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int[] a = new int[n1];
		for (int i = 0; i < n1; i++) {
			a[i] = s.nextInt();
		}
		int n2 = s.nextInt();
		int[] b = new int[n2];
		for (int i = 0; i < n2; i++) {
			b[i] = s.nextInt();
		}
		var c = sumOfArrays(a, b);
		displayArray(c);
	}

	private static int[] sumOfArrays(int[] a, int[] b) {
		int[] res = new int[(a.length > b.length ? a.length : b.length)];
		int c = 0; // carry
		for (int i = a.length - 1, j = b.length - 1, k = res.length - 1; k >= 0; i--, j--, k--) {
			int d = c;

			if (i >= 0)
				d += a[i];

			if (j >= 0)
				d += b[j];

			if (d > 9) {
				res[k] = d % 10;
				c = d / 10;
			} else {
				c = 0;
				res[k] = d;
			}
		}
		return res;
	}

	private static void displayArray(int[] c) {
		for (int ele : c) {
			System.out.println(ele);
		}
	}

}