package design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinStackTest {
    @Test
    @DisplayName("Test min stack")
    public void testMinStack() {
        MinStack stack = new MinStack();
        stack.push(0);
        Assertions.assertEquals(0,stack.getMin());
        stack.push(-1);
        Assertions.assertEquals(-1, stack.getMin());
        stack.push(2);
        Assertions.assertEquals(-1, stack.getMin());
        stack.pop();
        Assertions.assertEquals(-1, stack.top());
        stack.push(-2);
        Assertions.assertEquals(-2, stack.getMin());
        stack.pop();
        Assertions.assertEquals(-1, stack.getMin());
    }
}
