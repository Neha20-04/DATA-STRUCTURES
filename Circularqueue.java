
// in the normal queue if we remove element from first position then we push all the elements one step forward. means we move rear frontward.
// in circular queue we move front backwards. if we want to add element then rear comes to front. rear+1=front
import java.util.*;

public class Circularqueue {
    static class que {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        que(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // enqueue-O(1)
        public static void add(int data) {
            if (isFull()) {
                System.out.println("queue full");
                return;
            }
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // dequeue-O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("queue empty");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek-O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        que q = new que(5);
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
