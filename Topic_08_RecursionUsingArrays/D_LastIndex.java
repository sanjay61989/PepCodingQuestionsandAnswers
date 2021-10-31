package Topic_08_RecursionUsingArrays;

import java.util.Scanner;

public class D_LastIndex {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int x = s.nextInt();
		int lastIndex = lastIndex(a, a.length - 1, x);
		System.out.println(lastIndex);
	}

	public static int lastIndex(int[] arr, int idx, int x) {
		if (idx == -1) {
			return -1;
		}
		int li = lastIndex(arr, idx - 1, x);
		if (arr[idx] == x) {
			return idx;
		}

		return li;
	}
}