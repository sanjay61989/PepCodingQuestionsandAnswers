package Topic_03_NumberSystem;

import java.util.*;

public class E_AnyBaseAddition {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		System.out.println(getAnyBaseAddition(b, n1, n2));
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