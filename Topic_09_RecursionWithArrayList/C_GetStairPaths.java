package Topic_09_RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class C_GetStairPaths {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(getStairPaths(n));
	}

	public static ArrayList<String> getStairPaths(int n) {
		if (n <= 0) {
			ArrayList<String> res = new ArrayList<String>();
			if (n == 0) {
				res.add("");
			}
			return res;
		}
		ArrayList<String> pathOne = getStairPaths(n - 1);
		ArrayList<String> pathTwo = getStairPaths(n - 2);
		ArrayList<String> pathThree = getStairPaths(n - 3);
		ArrayList<String> oneRes = new ArrayList<String>();
		ArrayList<String> twoRes = new ArrayList<String>();
		ArrayList<String> threeRes = new ArrayList<String>();

		ArrayList<String> paths = new ArrayList<String>();

		for (String s : pathOne) {
			paths.add(1 + s);
		}
		for (String s : pathTwo) {
			paths.add(2 + s);
		}
		for (String s : pathThree) {
			paths.add(3 + s);
		}
		return paths;
	}
}
