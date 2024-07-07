import java.util.*;

public class LL {
    Node head;

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addStart(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addEnd(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newNode;
    }

    public void List() {

        if (head == null) {
            System.out.println("no list");
            return;
        }
        Node currNode = head;
        while (currNode != null) {

            System.out.println(currNode.data + " --->");
            currNode = currNode.next;

        }
        System.out.println("null");

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("no list");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("no list");
            return;
        }
        if (head.next = null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addStart("a");
        list.addEnd("u");
        list.addStart("i");
        list.List();

    }
}

// there are inbuild functions without writing from scratch
public class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("h");
        list.remove("h");

        System.out.println(list);
        System.out.println(list.size());
    }
}

// This code is for array
public class LL {
    public static void main(String[] args) {

        LinkedList<int[]> list = new LinkedList<int[]>();

        int[] arr = { 2, 5, 6, 7 };

        list.add(arr);

        for (int[] array : list) {

            System.out.println(Arrays.toString(array)); // Here we convert to string bcz if we directly print arr it
                                                        // gives us the memeory address rather than elements in arr.
        }
    }
}
