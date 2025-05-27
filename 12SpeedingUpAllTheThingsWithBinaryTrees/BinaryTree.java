import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}

public class BinaryTree {
    static int index = -1;

    
    public static Node buildTree(int[] preorder) {
        index++;
        if (index >= preorder.length || preorder[index] == -1) {
            return null;
        }

        Node root = new Node(preorder[index]);
        root.left = buildTree(preorder);
        root.right = buildTree(preorder);

        return root;
    }

    public static void preorderTraversal(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void inorderTraversal(Node root) {
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static void postorderTraversal(Node root) {
        if (root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrderTraversal(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
    }

    public static void main(String[] args) {
        int[] preorderList = {0, 5, 3, -3, -5, 3, 6, 7, -7};
        Node root = buildTree(preorderList);

        System.out.println("Level Order:");
        levelOrderTraversal(root);

        System.out.println("\nPreorder:");
        preorderTraversal(root);

        System.out.println("\nInorder:");
        inorderTraversal(root);

        System.out.println("\nPostorder:");
        postorderTraversal(root);
    }
}
