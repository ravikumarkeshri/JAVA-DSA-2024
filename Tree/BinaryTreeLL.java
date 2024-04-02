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

    public void insertNode(String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if (root == null) {
            root = newNode;
            // System.out.println("Value Inserted Successfully...");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode curr = queue.remove();
            if (curr.left == null) {
                curr.left = newNode;
                // System.out.println("Value Inserted Successfully...");
                break;
            } else if (curr.right == null) {
                curr.right = newNode;
                // System.out.println("Value Inserted Successfully...");
                break;
            } else {
                queue.add(curr.left);
                queue.add(curr.right);
            }

        }
    }

    public BinaryNode getDeepestNode() {
        if (root == null) {
            System.out.println("Tree is empty");
            return null;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode deepNode = null;
        while (!queue.isEmpty()) {
            deepNode = queue.remove();
            if (deepNode.left != null) {
                queue.add(deepNode.left);
            }
            if (deepNode.right != null) {
                queue.add(deepNode.right);
            }
        }
        return deepNode;
    }

    public void deleteDeepestNode() {
        if (root == null) {
            System.out.println("Tree is already Empty");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode curr = null, prev = null;
        while (!queue.isEmpty()) {
            prev = curr;
            curr = queue.remove();
            if (curr.left == null) {
                prev.right = null;
                return;
            } else if (curr.right == null) {
                curr.left = null;
                return;
            } else {
                queue.add(curr.left);
                queue.add(curr.right);
            }
        }
    }

    public void deleteNode(String value) {
        if (root == null) {
            System.out.println("Tree is already Empty");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode curr = queue.remove();
            if (curr.value == value) {
                curr.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("Node is deleted...");
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
        System.out.println("The node does not present in the Tree");
    }

    public void deleteEntireTree() {
        root = null;
        System.out.println("Entire Tree is Deleted..");
        return;
    }

    public static void main(String[] args) {
        BinaryTreeLL bTree = new BinaryTreeLL();
        bTree.insertNode("Drinks");
        bTree.insertNode("Hot");
        bTree.insertNode("Cold");
        bTree.insertNode("tea");
        bTree.insertNode("coffee");
        bTree.insertNode("cola");
        bTree.insertNode("fruty");
        bTree.levelOrderTraversal();
        // bTree.preOrderTraversal(bTree.root);
        // bTree.inOrderTraversal(bTree.root);
        // bTree.postOrderTraversal(bTree.root);
        // System.out.println("DeepestNode: " + bTree.getDeepestNode().value);
        // bTree.deleteDeepestNode();
        // bTree.levelOrderTraversal();
        System.out.println("DeepestNode: " + bTree.getDeepestNode().value);
        bTree.deleteNode("Cold");
        bTree.levelOrderTraversal();
    }
}
