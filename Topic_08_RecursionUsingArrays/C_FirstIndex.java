package Topic_08_RecursionUsingArrays;

import java.util.Scanner;

public class C_FirstIndex {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int x = s.nextInt();
		int firstIndex = firstIndex(a, 0, x);
		System.out.println(firstIndex);
	}

	public static int firstIndex(int[] arr, int idx, int x) {
		if (idx == arr.length) {
			return -1;
		}
		if (arr[idx] == x) {
			return idx;
		}
		int fi = firstIndex(arr, idx + 1, x);
		return fi;
	}

}
