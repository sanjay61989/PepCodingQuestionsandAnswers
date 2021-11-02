package Topic_04_Arrays;

import java.util.*;

public class H_InverseOfArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n1 = s.nextInt();
		int[] a = new int[n1];
		for (int i = 0; i < n1; i++) {
			a[i] = s.nextInt();
		}
		a = inverse(a);
		displayArray(a);
	}

	private static int[] inverse(int[] a) {
		int i = 0;
		int res[] = new int[a.length];
		while (i < a.length) {
			res[a[i]] = i;
			i++;
		}
		return res;
	}

	private static void displayArray(int[] c) {
		int i = 0;
		while (i < c.length) {
			System.out.println(c[i]);
			i++;
		}
	}

}