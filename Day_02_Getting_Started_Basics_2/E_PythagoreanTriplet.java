package Day_02_Getting_Started_Basics_2;

import java.util.*;

public class E_PythagoreanTriplet {

	public static void main(String[] args) {
		// write your code here
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}

		if (max == a) {
			if ((a * a) == (b * b) + (c * c)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else if (max == b) {
			if ((b * b) == (a * a) + (c * c)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			if ((c * c) == (b * b) + (a * a)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}

	}
}