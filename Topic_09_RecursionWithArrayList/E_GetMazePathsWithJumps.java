package Topic_09_RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class E_GetMazePathsWithJumps {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		System.out.println(getMazePathsWithJumps(1, 1, n, m));
	}

	public static ArrayList<String> getMazePathsWithJumps(int sr, int sc, int dr, int dc) {
		if (sr == dr && sc == dc) {
			ArrayList<String> res = new ArrayList<String>();
			res.add("");
			return res;
		}
		ArrayList<String> paths = new ArrayList<String>();

		//Horizontal moves
		for (int ms = 1; ms <= dc - sc; ms++) {
			ArrayList<String> hPaths = getMazePathsWithJumps(sr, sc + ms, dr, dc);
			for (String s : hPaths) {
				paths.add("h" + ms + s);
			}
		}

		//vertical moves
		for (int ms = 1; ms <= dr - sr; ms++) {
			ArrayList<String> vPaths = getMazePathsWithJumps(sr + ms, sc, dr, dc);
			for (String s : vPaths) {
				paths.add("v" + ms + s);
			}
		}

		//diagonal moves
		for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
			ArrayList<String> dPaths = getMazePathsWithJumps(sr + ms, sc + ms, dr, dc);
			for (String s : dPaths) {
				paths.add("d" + ms + s);
			}
		}

		return paths;
	}
}