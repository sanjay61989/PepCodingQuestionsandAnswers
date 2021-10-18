package Day_11_Strings_ArrayList;

import java.util.Scanner;

public class A_PrintAllPalindromicSubstrings {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		PrintAllPalindromicSubstrings(str);
	}

	private static void PrintAllPalindromicSubstrings(String str) {
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String s = str.substring(i, j);
				boolean isPalindrome = checkPalindrome(s);
				if (isPalindrome) {
					System.out.println(s);
				}
			}
		}

	}

	private static boolean checkPalindrome(String s) {
		int li = 0;
		int ri = s.length() - 1;
		boolean isPalindrome = false;
		if (s.length() == 1) {
			return true;
		}
		while (li <= ri) {
			if (s.charAt(li) == s.charAt(ri)) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
				break;
			}
			li++;
			ri--;
		}
		return isPalindrome;

	}

}