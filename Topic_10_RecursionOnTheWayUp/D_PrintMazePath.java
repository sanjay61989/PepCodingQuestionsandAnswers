package Topic_10_RecursionOnTheWayUp;

import java.util.*;

public class D_PrintMazePath {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		printMazePaths(0, 0, n - 1, m - 1, "");
	}

	public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
		if (sr > dr || sc > dc) {
			return;
		}

		if (sr == dr && sc == dc) {
			System.out.println(psf);
			return;
		}

		printMazePaths(sr, sc + 1, dr, dc, psf + "h");
		printMazePaths(sr + 1, sc, dr, dc, psf + "v");
	}
}