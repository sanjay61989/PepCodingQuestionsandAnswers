package Topic_14_Stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class E_LargestAreaHistogram {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        // code
        int[] rb = new int[n]; // nse index to right
        Stack<Integer> st = new Stack<>();
        st.push(n - 1);
        rb[n - 1] = n;

        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && a[i] <= a[st.peek()]) {
                st.pop();
            }
            if (st.size() > 0) {
                rb[i] = st.peek();
            } else {
                rb[i] = n;
            }
            st.push(i);
        }

        int[] lb = new int[n]; // nse index to left

        st = new Stack<>();
        st.push(0);
        lb[0] = -1;

        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && a[i] <= a[st.peek()]) {
                st.pop();
            }
            if (st.size() > 0) {
                lb[i] = st.peek();
            } else {
                lb[i] = -1;
            }
            st.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = rb[i] - lb[i] - 1;
            int area = a[i] * width;

            if (area > maxArea) {
                maxArea = area;
            }
        }

        System.out.println(maxArea);
    }
}