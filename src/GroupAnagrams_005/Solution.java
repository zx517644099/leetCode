package GroupAnagrams_005;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class Solution {

    public static void main(String[] args) {

        System.out.println(isValid(""));
    }

    public static boolean isValid(String s) {
        char chArr[] = s.toCharArray();
        Stack<Character> stack = new Stack();
        for (Character ch : chArr) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(')
                    return false;
                stack.pop();
            } else if (ch == '}') {
                if (stack.isEmpty() || stack.peek() != '{')
                    return false;
                stack.pop();
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[')
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}
