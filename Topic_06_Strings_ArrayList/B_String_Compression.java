package Topic_06_Strings_ArrayList;

import java.util.*;

public class B_String_Compression {

	public static String compression1(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == str.length() - 1) {
				s = s + str.charAt(i);
				break;
			}
			char a = str.charAt(i);
			char b = str.charAt(i + 1);
			if (a != b) {
				s = s + str.charAt(i);
			}
		}
		return s;
	}

	public static String compression2(String str) {
		String s = "";
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (i == str.length() - 1) {
				s = s + str.charAt(i) +  (count > 1 ? count : "");
				break;
			}
			if (str.charAt(i) != str.charAt(i + 1)) {
				s = s + str.charAt(i) + (count > 1 ? count : "");
				count = 1;
			} else {
				count++;
			}
		}

		return s;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}