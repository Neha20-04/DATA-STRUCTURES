
//queue using linked list
//If we want to add element then we add at the end. If we want to remove then we remove it in the front.
import java.util.*;

public class QueueLL {  
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class Queue { // here if we declare the q class as static then there is no need to create instance for outer class.
        Node head = null;
        Node tail = null;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // Enqueue - O(1)
        public void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Dequeue - O(1)
        public int remove() {
            if (isEmpty()) {
                System.out.println("queue empty");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        // Peek - O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {

        QueueLL queueLL = new QueueLL(); // Instance for outer class.
        Queue queue = queueLL.new Queue();// Instance for inner class.

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
