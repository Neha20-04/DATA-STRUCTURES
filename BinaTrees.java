import java.util.*;

public class BinaTrees {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree {
        static int idx = -1; // to travel at every index we need a variable which is idx start from -1.

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    // pre order traversal. root,left,right

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " "); // Print the data before traversing left and right subtrees
        preorder(root.left);
        preorder(root.right);
    }

    // In order traversal. left,root,right
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // post order traversal . left,right,root
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelorder(Node root) { // O(n)
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }

        }

    }

    public static int countofNodes(Node root) { // - O(n)
        if (root == null) {
            return 0;
        }
        int leftNodes = countofNodes(root.left);
        int rightNodes = countofNodes(root.right);
        return leftNodes + rightNodes + 1;

    }

    public static int sumofNodes(Node root) { // - O(n)
        if (root == null) {
            return 0;
        }
        int leftNodes = sumofNodes(root.left);
        int rightNodes = sumofNodes(root.right);
        return leftNodes + rightNodes + root.data;

    }

    public static int height(Node root) { // O(n)
        if (root == null) {
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        int treeheight = Math.max(leftheight, rightheight) + 1;
        return treeheight;

    }

    public static int diameter(Node root) { // O(n^2)
        if (root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;
        return Math.max(diam3, Math.max(diam1, diam2));
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data); // this is to print the binary tree.
        preorder(root); // This will print the nodes in preorder traversal
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);
        System.out.println();
        System.out.println(countofNodes(root));
        System.out.println(sumofNodes(root));
        System.out.println(height(root));
        System.out.println(diameter(root));
    }
}
