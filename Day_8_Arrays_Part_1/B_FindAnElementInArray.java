package Day_8_Arrays_Part_1;

import java.util.Scanner;

public class B_FindAnElementInArray {
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int key = s.nextInt();
		int rv = findElement(a, key);
		System.out.println(rv);
	}

	private static int findElement(int[] a, int key) {
		int rv = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				rv = i;
				break;
			}
		}
		return rv;
	}
}