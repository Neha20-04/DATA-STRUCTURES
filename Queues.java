
//queue using collection framework
import java.util.*;

public class Queues {
    public static void main(String[] args) {
        // Queue<Integer> queue = new LinkedList<Integer>(); Queue is a interface so we
        // can run this in 2 ways using linked list and ArrayDeque.
        Queue<Integer> queue = new ArrayDeque<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.peek()); // Should print 1

        queue.remove();
        System.out.println(queue.peek()); // Should print 2

        queue.add(6);
        System.out.println(queue.peek()); // Should print 2
    }
}