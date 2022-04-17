package Topic_20_DynamicProgramming;

import java.util.Scanner;

public class U_MaximumSumNonAdjacentElements {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int inc = arr[0];                                       //1
        int exc = 0;
        for (int i = 1; i < n; i++) {
            int ninc = exc + arr[i];                            //2
            int nexc = Math.max(inc, exc);
            inc = ninc;                                         //3
            exc = nexc;
        }

        System.out.println(Math.max(inc, exc));                 //4


    }
}