package Topic_07_Recursion;

import java.io.*;
import java.util.*;

public class G_PrintZigZag {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printZigZag(n);
	}

	public static void printZigZag(int n) {
		if (n <= 0) {
			return;
		}
		System.out.print(n + " ");
		printZigZag(n - 1);
		System.out.print(n + " ");
		printZigZag(n - 1);
		System.out.print(n + " ");
	}

}