package Topic_03_NumberSystem;

import java.util.*;

public class G_AnyBaseMultiplication {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = getProduct(b, n1, n2);
		System.out.println(d);
	}

	public static int getProduct(int b, int n1, int n2) {
		int rv = 0, p = 1;

		while (n2 > 0) {
			int d = n2 % 10;
			int temp = getProducts(b, n1, d);
			temp = temp * p;
			rv = getAnyBaseAddition(b, rv, temp);
			n2 = n2 / 10;
			p = p * 10;
		}
		return rv;
	}

	public static int getProducts(int b, int n1, int d2) {
		int rv = 0, p = 1, d = 0, c = 0;
		while (n1 > 0 || c > 0) {
			int d1 = n1 % 10;
			d = d1 * d2 + c;
			if (d >= b) {
				c = d / b;
				d = d % b;
			} else {
				c = 0;
				d = d;
			}
			rv = rv + d * p;
			n1 = n1 / 10;
			p = p * 10;
		}
		return rv;
	}

	public static int getAnyBaseAddition(int b, int n1, int n2) {
		int rv = 0;
		int c = 0;
		int p = 1;
		while (n1 > 0 || n2 > 0) {
			int d1 = n1 % 10;
			int d2 = n2 % 10;

			int add = d1 + d2 + c;
			if (add >= b) {
				c = 1;
				add = add % b;
				rv = rv + (add * p);
			} else {
				c = 0;
				rv = rv + (add * p);
			}
			n1 = n1 / 10;
			n2 = n2 / 10;
			p = p * 10;
		}
		if (c == 1)
			rv = rv + (c * p);
		return rv;
	}
}