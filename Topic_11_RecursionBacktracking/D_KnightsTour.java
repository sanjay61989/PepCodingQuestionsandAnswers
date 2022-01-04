package Topic_11_RecursionBacktracking;

import java.io.*;

import java.util.*;

public class D_KnightsTour {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		int c = s.nextInt();
		int[][] chess = new int[n][n];
		printKnightsTour(chess, r, c, 1);
	}

	private static void printKnightsTour(int[][] chess, int r, int c, int move) {
		// TODO Auto-generated method stub
		if (r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0) {
			return;
		} else if (move == chess.length * chess.length) {
			chess[r][c] = move;
			displayBoard(chess);
			chess[r][c] = 0;
			return;
		}
		chess[r][c] = move;
		printKnightsTour(chess, r - 2, c + 1, move + 1);
		printKnightsTour(chess, r - 1, c + 2, move + 1);
		printKnightsTour(chess, r + 1, c + 2, move + 1);
		printKnightsTour(chess, r + 2, c + 1, move + 1);
		printKnightsTour(chess, r + 2, c - 1, move + 1);
		printKnightsTour(chess, r + 1, c - 2, move + 1);
		printKnightsTour(chess, r - 1, c - 2, move + 1);
		printKnightsTour(chess, r - 2, c - 1, move + 1);
		chess[r][c] = 0;

	}

	private static void displayBoard(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}