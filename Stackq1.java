
//push at the bottom of the stack.
// Here we solve this using recurssion. inside the recurssion there is a implicit stack.first we remove all the elements from stack and add new element at bottom. 
import java.util.*;

public class Stackq1 {
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(87);
        s.push(67);
        s.push(78);
        pushAtBottom(4, s);

        // Print the entire stack to verify the correct order
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
