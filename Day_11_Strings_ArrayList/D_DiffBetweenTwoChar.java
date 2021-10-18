package Day_11_Strings_ArrayList;

import java.util.Scanner;

public class D_DiffBetweenTwoChar {
	public static String solution(String str) {
		StringBuilder rv = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (i == str.length() - 1) {
				rv.append(str.charAt(i));
			} else {
				int diff = (int) str.charAt(i + 1) - (int) str.charAt(i);
				rv.append(str.charAt(i) + "" + diff);
			}
		}
		return rv.toString();
	}

	public static String solution2(String str) {
		StringBuilder rv = new StringBuilder();
		rv.append(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);
			int diff = curr - prev;
			rv.append(diff);
			rv.append(str.charAt(i));

		}
		return rv.toString();
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = "pepCODinG";// scn.next();
		System.out.println(solution2(str));
	}
}