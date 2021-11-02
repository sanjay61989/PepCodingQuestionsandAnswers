package Topic_09_RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class D_GetMazePaths {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		System.out.println(getMazePaths(1, 1, n, m));
	}

	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
		if (sr == dr && sc == dc) {
			ArrayList<String> res = new ArrayList<String>();
			res.add("");
			return res;
		}

		ArrayList<String> hPaths = new ArrayList<String>();
		ArrayList<String> vPaths = new ArrayList<String>();

		if (sc < dc)
			hPaths = getMazePaths(sr, sc + 1, dr, dc);//2

		if (sr < dr)
			vPaths = getMazePaths(sr + 1, sc, dr, dc);//1

		ArrayList<String> paths = new ArrayList<String>();

		for (String s : hPaths) {
			paths.add("h" + s);
		}
		for (String s : vPaths) {
			paths.add("v" + s);
		}
		return paths;
	}
}

/*
Sample Input
3
3
Sample Output
[hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]

*/