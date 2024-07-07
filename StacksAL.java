import java.util.ArrayList;

public class StacksAL {
    class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int data) { // O(1)
            list.add(data);

        }

        public int pop() { // remove the last element O(1)
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1); // here last element is stored as top. size-1 is index of last element.
            list.remove(list.size() - 1);// we are removing the last element.
            return top; // we return the last element after popping.
        }

        public int peek() { // O(1)
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

        public static void main(String[] args) {
            StacksAL.Stack s = new StacksAL().new Stack();
            s.push(1);
            s.push(87);
            s.push(67);
            s.push(78);
            s.pop();
            s.pop();

            System.out.println(s.peek()); // This should print 67
        }
    }
}

// Stack<Integers=new Stack<>(); this is collection framework of stack.