package algorithms.stack;

import java.util.Stack;

class BalancedBrackets {
  public static boolean balancedBrackets(String s) {
    // Write your code here.
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
      if (ch == '(' || ch == '[' || ch == '{') {
        stack.push(ch);
      }

      if (ch == ')' || ch == ']' || ch == '}') {
        if (stack.empty()) {
          return false;
        }

        char top = stack.pop();

        if (ch == ')' && top != '(' || ch == ']' && top != '[' || ch == '}' && top != '{') {
          return false;
        }
      }
    }
    return stack.empty();
  }
}
