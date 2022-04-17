package Topic_18_Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class F_NumberOfIslands {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int m = Integer.parseInt(br.readLine());

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[m][n];


        for (int i = 0; i < arr.length; i++) {

            String parts = br.readLine();

            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = Integer.parseInt(parts.split(" ")[j]);

            }

        }


        // write your code here

        boolean[][] visited = new boolean[m][n];


        int count = 0;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (visited[i][j] == false && arr[i][j] == 0) {

                    count++;

                    fillComp(arr, visited, i, j);

                }

            }

        }


        System.out.println(count);

    }


    static void fillComp(int[][] arr, boolean[][] visited, int i, int j) {

        visited[i][j] = true;


        if (i + 1 >= 0 && i + 1 < arr.length && visited[i + 1][j] == false && arr[i + 1][j] == 0) {

            fillComp(arr, visited, i + 1, j);

        }


        if (i - 1 >= 0 && i - 1 < arr.length && visited[i - 1][j] == false && arr[i - 1][j] == 0) {

            fillComp(arr, visited, i - 1, j);

        }


        if (j + 1 >= 0 && j + 1 < arr[0].length && visited[i][j + 1] == false && arr[i][j + 1] == 0) {

            fillComp(arr, visited, i, j + 1);

        }


        if (j - 1 >= 0 && j - 1 < arr[0].length && visited[i][j - 1] == false && arr[i][j - 1] == 0) {

            fillComp(arr, visited, i, j - 1);

        }

    }


}