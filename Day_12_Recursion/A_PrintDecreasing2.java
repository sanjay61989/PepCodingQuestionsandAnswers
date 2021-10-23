package Day_12_Recursion;

import java.io.*;
import java.util.*;

public class A_PrintDecreasing2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        printDecreasing(s.nextInt());
    }

    public static void printDecreasing(int n){
        if(n==0)
            return;
        
        System.out.println(n);
        printDecreasing(n-1);
    }

}