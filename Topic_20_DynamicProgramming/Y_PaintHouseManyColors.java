package Topic_20_DynamicProgramming;

import java.util.Scanner;

public class Y_PaintHouseManyColors {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();

        int[][] arr = new int[n][c];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int[][] dp = new int[arr.length][arr[0].length];
        for (int j = 0; j < arr[0].length; j++) {
            dp[0][j] = arr[0][j];
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                int min = Integer.MAX_VALUE;

                for (int k = 0; k < dp[0].length; k++) {
                    if (k != j) {
                        if (dp[i - 1][k] < min) {
                            min = dp[i - 1][k];
                        }
                    }
                }
                dp[i][j] = arr[i][j] + min;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int k = 0; k < dp[0].length; k++) {
            if (dp[n - 1][k] < min) {
                min = dp[n - 1][k];
            }
        }
        System.out.println(min);
    }
}