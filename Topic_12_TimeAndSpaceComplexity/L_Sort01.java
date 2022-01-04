package Topic_12_TimeAndSpaceComplexity;

import java.io.*;

import java.util.*;

public class L_Sort01 {

	public static void sort01(int[] arr) {
		// 0 to j-1  ->  All Zeroes //
		// j to i-1  ->  All One's //
		/* i to arr.length-1 -> All unknowns */

		int i = 0, j = 0;
		while (i < arr.length) {
			if (arr[i] == 0) {
				swap(arr, i, j);
				i++;
				j++;
			} else {
				i++;
			}
		}
	}

	// used for swapping ith and jth elements of array
	public static void swap(int[] arr, int i, int j) {
		System.out.println("Swapping index " + i + " and index " + j);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		sort01(arr);
		print(arr);
	}
}