package Topic_20_DynamicProgramming;

import java.util.Scanner;

public class F_Goldmine {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {                       //1
                arr[i][j] = scn.nextInt();
            }
        }

        int[][] dp = new int[n][m];                                 //2
        for (int j = m - 1; j >= 0; j--) {                         //3
            for (int i = n - 1; i >= 0; i--) {                     //4

                if (j == m - 1) {
                    dp[i][j] = arr[i][j];                          //5
                } else if (i == 0) {                                 //6
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
                } else if (i == n - 1) {                             //7
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
                } else {                                             //8
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i + 1][j + 1],
                            dp[i - 1][j + 1]));
                }
            }

        }
        int max = dp[0][0];                                        //9
        for (int i = 1; i < n; i++) {
            if (dp[i][0] > max)                                //10
                max = dp[i][0];
        }
        System.out.println(max);                                   //11
    }

}