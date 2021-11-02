package Topic_04_Arrays;

import java.util.*;

public class E_DifferenceOfTwoArrays {
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
		var c = diffOfTwoArrays(a, b);
		displayArray(c);
	}

	private static int[] diffOfTwoArrays(int[] a, int[] b) {
		int[] res = new int[(a.length > b.length ? a.length : b.length)];
		int borrow = 0;
		for (int i = a.length - 1, j = b.length - 1, k = res.length - 1; k >= 0; i--, j--, k--) {
			int d = 0;

			d = (b[j]-borrow);
			if(i>=0)
				d=d-a[i];
			if (d < 0) {
				d = d + 10;// - borrow;
				borrow = 1;
			} else {
				borrow = 0;
				d = d;
			}
			res[k] = d;
		}
		return res;
	}

	private static void displayArray(int[] c) {
		int i=0;
		while(c[i]==0) {
			i++;
		}
		while(i<c.length) {
			System.out.println(c[i]);
			i++;
		}
	}

}