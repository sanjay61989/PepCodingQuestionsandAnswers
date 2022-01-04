package Others;
import java.util.*;

public class TargetSumTriplet {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int tar = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        // sort = nlogn
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            int ntar = tar - arr[i];
            
            int j = i + 1;
            int k = arr.length - 1;
            while(j < k){
                if(arr[j] + arr[k] > ntar){
                    k--;
                } else if(arr[j] + arr[k] < ntar){
                    j++;
                } else {
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    j++;
                    k--;
                }
            }
        }
    }
}