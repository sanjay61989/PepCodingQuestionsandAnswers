package Topic_20_DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J_ZeroOneKnapsack {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] price = new int[n];
        String str1 = br.readLine();
        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(str1.split(" ")[i]);
        }

        int[] weight = new int[n];
        String str2 = br.readLine();
        for (int i = 0; i < n; i++) {
            weight[i] = Integer.parseInt(str2.split(" ")[i]);
        }

        int cap = Integer.parseInt(br.readLine());

        int[][] dp = new int[n + 1][cap + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int val = price[i - 1];
                int wt = weight[i - 1];

                if (j >= wt) { //If the current capacity is greater than the weight of the current item
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - wt] + val); // max cost will be max of cost before putting the item and after putting it
                } else {
                    dp[i][j] = dp[i - 1][j]; //If current capacity is less than weight do not add item to the bag
                }
            }
        }

        System.out.println(dp[n][cap]);
    }
}