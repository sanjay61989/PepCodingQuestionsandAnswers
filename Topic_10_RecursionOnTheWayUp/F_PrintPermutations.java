package Topic_10_RecursionOnTheWayUp;

import java.util.*;

public class F_PrintPermutations {

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		printPermutations2(str, "");

	}

	private static void printPermutations2(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			StringBuilder s = new StringBuilder(str);
			s.deleteCharAt(i);
			printPermutations2(s.toString(), ans + ch);
		}
	}

	public static void printPermutations1(String str, String asf) {

		if (str.length() == 0) {
			System.out.println(asf); //Question string is empty so print the answer now and return
			return;
		}
		//Extracting each character at a time from the question string and appending it to answer so far
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String leftPart = str.substring(0, i); //Substring from 0 to i-1 (left to ch)
			String rightPart = str.substring(i + 1); //Substring from i+1 till end of String (right to ch)
			String roq = leftPart + rightPart; //Remaining string after extracting ch
			printPermutations1(roq, asf + ch);
		}

	}
}