package Topic_09_RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class A_GetSubSequence {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		ArrayList<String> res = gss(str);
		System.out.println(res);
	}

	public static ArrayList<String> gss(String str) {
		if (str.length() == 0) {
			ArrayList<String> res = new ArrayList<String>();
			res.add("");
			return res;
		}
		String charAtZero = String.valueOf(str.charAt(0));
		String ros = str.substring(1);
		ArrayList<String> result = gss(ros);
		ArrayList<String> newResult = new ArrayList<String>();
		for (int i = 0; i < result.size(); i++) {
			newResult.add(result.get(i));
		}
		for (int i = 0; i < result.size(); i++) {
			newResult.add(charAtZero + result.get(i));
		}		
		return newResult;
	}
}
/*
Sample Input
abc
Sample Output
[, c, b, bc, a, ac, ab, abc] 
*/
