package main.java.Probleme.stiva;

import java.util.Stack;

public class Stiva {
    public static void main(String[] args) {
        System.out.println(isBalanced("((([])))"));
    }
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if(c==')'||c=='{'|| c==']') {
                if (stack.isEmpty())
                    return false;
                char previous = stack.pop();
                if (previous == '(' && c != ')')
                    return false;
                if (previous == '[' && c != ']')
                    return false;
                if (previous == '{' && c != '}')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}