
//It has 3 opeartions add,remove,peek.
//peek is used to see the element that is in front. 
// In the start front and rear will be at the same place. when another element added the front will be at same position rear will move.
import java.util.*;

public class queue {
    static class Que {
        int arr[];
        int size;
        int rear = -1;

        Que(int size) {
            arr = new int[size];
            this.size = size;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        // Enqueue - O(1)
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Dequeue - O(n)
        public int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // Peek - O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {

        Que q = new Que(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.peek()); // Should print 1

        q.remove();
        System.out.println(q.peek()); // Should print 2

        q.add(6);
        System.out.println(q.peek()); // Should print 2
    }
}
