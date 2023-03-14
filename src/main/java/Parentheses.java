import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Parentheses {

    public static int countValidParentheses(String s) {

        int count = 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1); // помещаем в стек начальный индекс

        Set<String> validParentheses = new HashSet<String>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    int currentCount = i - stack.peek();
                    if (currentCount > count) {
                        count = currentCount;
                        validParentheses.clear();
                        validParentheses.add(s.substring(stack.peek() + 1, i + 1));
                    } else if (currentCount == count) {
                        validParentheses.add(s.substring(stack.peek() + 1, i + 1));
                    }
                }
            }
        }

        for (String p : validParentheses) {
            System.out.println("Валидные скобки" + p);
        }

        return count;
    }
}
