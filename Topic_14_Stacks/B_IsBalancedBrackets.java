package Topic_14_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class B_IsBalancedBrackets {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        boolean res = IsBracketsBalanced(str);
        System.out.println(res);

    }

    private static boolean IsBracketsBalanced(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val = handleClosing(st, '(');
                if (val == false) {
                    return false;
                }
            } else if (ch == ']') {
                boolean val = handleClosing(st, '[');
                if (val == false) {
                    return false;
                }
            } else if (ch == '}') {
                boolean val = handleClosing(st, '{');
                if (val == false) {
                    return false;
                }
            }
        }
        if (st.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean handleClosing(Stack<Character> st, char corresopch) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != corresopch) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }

}