package Day_13_RecursionUsingArrays;

import java.util.Scanner;

public class A_DisplayArray {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		displayArr(a, a.length-1);
	}

	public static void displayArr(int[] arr, int idx) {
		if (idx == -1) {
			return;
		}
		System.out.println(arr[idx]);//To Print Straight
		displayArr(arr, idx - 1);
		System.out.println(arr[idx]);//To Print In reverse
	}

}