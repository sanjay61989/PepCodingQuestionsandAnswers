package Day_12_Recursion;



import java.io.*;
import java.util.*;

public class B_PrintIncreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        printIncreasing(new Scanner(System.in).nextInt());
    }

    public static void printIncreasing(int n){
        if(n==0)
            return;
        
        printIncreasing(n-1);
        System.out.println(n);
        
    }

}