package Topic_08_RecursionUsingArrays;

import java.util.Scanner;

public class B_FindMaxInArray {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int max = maxOfArray(a, a.length - 1);
		System.out.println(max);
	}

	public static int maxOfArray(int[] a, int idx) {
		if (idx == 0) {
			return a[idx];
		}
		int max = maxOfArray(a, idx - 1);
		if (a[idx] > max) {
			max = a[idx];
		}
		return max;
	}

}