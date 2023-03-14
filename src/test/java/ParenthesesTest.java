import static org.junit.Assert.assertEquals;

public class ParenthesesTest {

    @org.junit.Test
    public void testCountValidParentheses1() {
        String s = "(()";
        assertEquals(2, Parentheses.countValidParentheses(s));
    }

    @org.junit.Test
    public void testCountValidParentheses2() {
        String s = ")()())";
        assertEquals(4, Parentheses.countValidParentheses(s));
    }

    @org.junit.Test
    public void testCountValidParentheses3() {
        String s = ")(()())";
        assertEquals(6, Parentheses.countValidParentheses(s));
    }

    @org.junit.Test
    public void testCountValidParentheses4() {
        String s = ")(";
        assertEquals(0, Parentheses.countValidParentheses(s));
    }

}