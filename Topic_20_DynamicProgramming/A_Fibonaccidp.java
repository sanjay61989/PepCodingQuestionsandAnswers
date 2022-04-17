package Topic_20_DynamicProgramming;

import java.util.Scanner;

public class A_Fibonaccidp {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fib = Fib(n);
        System.out.println(fib);

        scn.close();
    }

    public static int Fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fibn1 = Fib(n - 1);
        int fibn2 = Fib(n - 2);
        int fibn = fibn1 + fibn2;
        return fibn;
    }
}