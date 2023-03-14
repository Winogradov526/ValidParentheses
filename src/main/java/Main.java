class Main {
    public static void main(String[] args) {

        String input1 = "(()";
        String input2 = ")()())";
        String input3 = ")(()())";
        String input4 = ")(";

        int count1 = Parentheses.countValidParentheses(input1);
        int count2 = Parentheses.countValidParentheses(input2);
        int count3 = Parentheses.countValidParentheses(input3);
        int count4 = Parentheses.countValidParentheses(input4);

        System.out.println(count1); // Expected: 2
        System.out.println(count2); // Expected: 4
        System.out.println(count3); // Expected: 6
        System.out.println(count4); // Expected: 0
    }
}
