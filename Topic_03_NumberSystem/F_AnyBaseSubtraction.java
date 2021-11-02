package Topic_03_NumberSystem;

import java.util.*;

public class F_AnyBaseSubtraction {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = getDifference(b, n1, n2);
		System.out.println(d);
	}

	public static int getDifference(int b, int n1, int n2) {
		int rv = 0;
		int borrow = 0;
		int p = 1;
		while (n2 > 0) {
			int d2 = n2 % 10;
			int d1 = n1 % 10;
			d2 = d2 - borrow;
			int d = d2 - d1;
			if (d < 0) {
				borrow = 1;
				d = d + b;
			} else {
				borrow = 0;
				d = d + 0;
			}
			rv = rv + d * p;
			p = p * 10;
			
			n1=n1/10;
			n2=n2/10;
		}
		return rv;
	}
}