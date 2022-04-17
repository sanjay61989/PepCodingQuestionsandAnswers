package Topic_20_DynamicProgramming;

import java.util.Scanner;

public class M_CountBinaryStrings {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int zeroes = 1;
        int ones = 1;
        for (int i = 2; i <= n; i++) {
            int nzeroes = ones;
            int nones = ones + zeroes;

            zeroes = nzeroes;
            ones = nones;
        }

        System.out.println(zeroes + ones);
    }

}