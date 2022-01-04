package Topic_01_GettingStartedBasics;

import java.util.*;
public class J_PythagoreanTriplet {
	public static void main(String[] args) {
		// write your code here
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		int max = a;
		max = b > max ? b : a;
		max = c > max ? c : a;		

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