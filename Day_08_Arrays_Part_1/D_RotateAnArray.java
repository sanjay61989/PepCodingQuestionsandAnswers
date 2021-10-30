package Day_08_Arrays_Part_1;

import java.util.*;

public class D_RotateAnArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n1 = s.nextInt();
		int[] a = new int[n1];
		for (int i = 0; i < n1; i++) {
			a[i] = s.nextInt();
		}
		int k = s.nextInt();
		rotate(a, k);
		displayArray(a);
	}

	private static void rotate(int[] a, int k) {
		k = k % a.length;
		if (k < 0) {
			k = k + a.length;
		}
		reverse(a, 0, a.length - 1);
		reverse(a, 0, k - 1);
		reverse(a, k, a.length - 1);

	}
	
	private static void reverse(int[] a, int left, int right) {
		while (left <= right) {
			int temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
	}

	private static void displayArray(int[] c) {
		int i = 0;
		while (i < c.length) {
			System.out.println(c[i]);
			i++;
		}
	}
}





