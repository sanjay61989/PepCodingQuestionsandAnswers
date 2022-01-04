package Others;
import java.util.*;


public class TargetSumPairWithBinarySearch {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int tar = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        // sort
        Arrays.sort(arr); //nlogn

        // binary search the compliment
        for(int i = 0; i < arr.length; i++){
            int theOtherNumber = tar - arr[i];

            // binary search the new Target
            int left = i + 1;
            int right = arr.length - 1;
            while(left <= right){
                int mid = (left + right) / 2;
                if(theOtherNumber < arr[mid]){
                    right = mid - 1;
                } else if (theOtherNumber > arr[mid]){
                    left = mid + 1;
                } else {
                    System.out.println(arr[i] + " " + arr[mid]);
                    break;
                }
            }
        }
        
    }
}