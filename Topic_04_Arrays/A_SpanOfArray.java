package Topic_04_Arrays;

import java.util.*;

public class A_SpanOfArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int rv = findMaxandMin(a);
		System.out.println(rv);
	}

	private static int findMaxandMin(int[] a) {
		int rv = 0;
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
			if (a[i] < min)
				min = a[i];
		}
		return max - min;
	}
}