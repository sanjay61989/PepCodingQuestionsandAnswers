package Topic_09_RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class B_GetKpc {
	//                      0     1      2      3      4      5      6       7     8      9
	static String[] arr = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		ArrayList<String> res = getKpc(str);
		System.out.println(res);
	}

	public static ArrayList<String> getKpc(String str) {
		if (str.length() == 0) {
			ArrayList<String> res = new ArrayList<>();
			res.add("");
			return res;
		}

		String charAtZero = String.valueOf(str.charAt(0));
		String ros = str.substring(1);

		ArrayList<String> result = getKpc(ros);
		ArrayList<String> newResult = new ArrayList<>();

		String getKeyPad = arr[Integer.valueOf(charAtZero)];
		for (int i = 0; i < getKeyPad.length(); i++) {
			for (String s : result) {
				newResult.add(String.valueOf(getKeyPad.charAt(i) + s));
			}
		}
		return newResult;
	}
}

/*

Sample Input
78
Sample Output
[tv, tw, tx, uv, uw, ux]

*/