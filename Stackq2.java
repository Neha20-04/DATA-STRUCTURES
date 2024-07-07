
//reverse the string
import java.util.*;

public class Stackq2 {
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(87);
        s.push(67);
        s.push(78);
        reverse(s);

        // Print the entire stack to verify the correct order
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

}