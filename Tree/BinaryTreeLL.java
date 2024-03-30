import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    public class BinaryNode {
        public String value;
        public BinaryNode left;
        public BinaryNode right;
        public int height;
    }

    BinaryTreeLL() {
        this.root = null;
    }

    // PreOrder Traversal

    public void preOrderTraversal(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    // InOrder Traversal

    public void inOrderTraversal(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(node.value + " ");
        inOrderTraversal(node.right);
    }

    // PostOrder Traversal

    public void postOrderTraversal(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.value + " ");
    }

    public void levelOrderTraversal() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode curr = queue.remove();
            System.out.println(curr.value + " ");
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
    }

    public void searchNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode curr = queue.remove();
            if (curr.value == value) {
                System.out.println("The value " + value + " found in tree");
                return;
            } else {
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
        System.out.println("value not found in the tree;");
    }

    public static void main(String[] args) {
        BinaryTreeLL bTree = new BinaryTreeLL();
    }
}
