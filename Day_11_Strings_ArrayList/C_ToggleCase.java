package Day_11_Strings_ArrayList;

import java.util.Scanner;

public class C_ToggleCase {

	public static String toggleCase(String str) {
		StringBuilder rv = new StringBuilder();
		StringBuilder s1 = new StringBuilder(str);
		for (int i = 0; i < s1.length(); i++) {
			Character ch = s1.charAt(i);// A,a
			if (ch >= 'A' && ch <= 'Z') {
				rv = rv.append(ch.toLowerCase(ch));
			} else {
				rv = rv.append(ch.toUpperCase(ch));
			}
		}
		return rv.toString();
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}