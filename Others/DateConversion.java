package Others;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING. The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String[] arr = s.split(":");
        int number = (Integer.parseInt(arr[0]));
        if (arr[2].indexOf("PM") > -1) {
            number = number != 12 ? number + 12 : number;
            String s2 = number + ":" + arr[1] + ":" + arr[2].replace("PM", "");
            return s2;
        } else {
            if (number == 12) {
                number = number - 12;
            }
            String s2 = number + ":" + arr[1] + ":" + arr[2].replace("AM", "");
            return s2;
        }
    }

}


public class DateConversion {
    public static void main(String[] args) throws IOException {
        String result = Result.timeConversion("12:01:00AM");
        System.out.println("Final - " + result);
    }
}
