package Topic_04_Arrays;

import java.io.*;
import java.util.*;

public class I_AllSubarrays {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		PrintSubArrays(arr);
	}

	private static void PrintSubArrays(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + "\t");
				}
				System.out.println();
			}
		}
	}

}