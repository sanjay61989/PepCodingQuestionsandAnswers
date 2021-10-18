package Day_09_Arrays_Part_2;

import java.util.*;

public class C_ReverseOfArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n1 = s.nextInt();
		int[] a = new int[n1];
		for (int i = 0; i < n1; i++) {
			a[i] = s.nextInt();
		}
		reverse(a);
		displayArray(a);
	}

	private static void reverse(int[] a) {
		int i = 0;
		int j = a.length - 1;
		while (i <= j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
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