package Topic_08_RecursionUsingArrays;

import java.util.Iterator;
import java.util.Scanner;

public class E_AllIndicesOfArray {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int x = s.nextInt();
		int arr[] = allIndices(a, x, 0, 0);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static int[] allIndices(int[] arr, int x, int idx, int count) {
		if (arr.length == idx) {
			return new int[count];
		}
		if (arr[idx] == x) {
			count++;
		}
		int[] a = allIndices(arr, x, idx + 1, count);
		if (arr[idx] == x) {
			a[count - 1] = idx;
		}
		return a;
	}
}
