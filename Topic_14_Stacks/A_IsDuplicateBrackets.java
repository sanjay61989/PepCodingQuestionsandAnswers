package Topic_14_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class A_IsDuplicateBrackets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ip = s.nextLine();
        boolean res = isDuplicateBrackets("(a + b) + (c + d)");
        System.out.println(res);
        res = isBalancedBrackets("(a+b)+(c+d)");
        System.out.println(res);
    }

    private static boolean isDuplicateBrackets(String ip) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < ip.length(); i++) {
            char ch = ip.charAt(i);
            if (ch == ')') {
                if (s.peek() == '(') {
                    return true;
                } else {
                    while (s.peek() != '(') {
                        s.pop();
                    }
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }

    private static boolean isBalancedBrackets(String ip) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < ip.length(); i++) {
            char ch = ip.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (!s.isEmpty()) s.pop();
            }
        }
        if (s.size() > 0) {
            return true;
        }
        return false;
    }
}
