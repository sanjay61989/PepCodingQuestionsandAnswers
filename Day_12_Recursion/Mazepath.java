package Day_12_Recursion;

import java.util.ArrayList;

public class Mazepath {
	public static void main(String[] args) {

	}

	public static ArrayList<String> getStairPaths(int n) {

		ArrayList<String> list1 = getStairPaths(n - 1);
		ArrayList<String> list2 = getStairPaths(n - 2);
		ArrayList<String> list3 = getStairPaths(n - 3);
		return null;
	}
}

/*
 * 
 * 3 2 1 0 ->ground flor
 * 
 * 
 */