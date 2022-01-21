import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(10);

        /*System.out.println(stack.peek());
        System.out.println(stack.pop());
*/

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}


