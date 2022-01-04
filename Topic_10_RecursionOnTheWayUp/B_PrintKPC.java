package Topic_10_RecursionOnTheWayUp;

import java.io.*;

import java.util.*;

public class B_PrintKPC {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		printKPC(str, "");
	}

	static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" }; //1

	public static void printKPC(String ques, String ans) {
		if (ques.length() == 0) //2
		{
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0); //3
		String roq = ques.substring(1); //4
		String codeforch = codes[ch - '0']; //5
		for (int i = 0; i < codeforch.length(); i++) //6
		{
			char cho = codeforch.charAt(i);
			printKPC(roq, ans + cho); //7
		}

	}

}
