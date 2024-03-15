package NormalQuestion;

import java.util.ArrayDeque;

public class Problem3 {
    private Node root;

    private static class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        Node(int value, Node lChild, Node rChild) {
            this.value = value;
            this.leftChild = lChild;
            this.rightChild = rChild;
        }

        Node(int value) {
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }

    }

    public Problem3() {
        root = null;
    }

    public void levelOrderBinaryTree(int arr[]) {
        root = levelOrderBinaryTree(arr, 0);
    }

    public Node levelOrderBinaryTree(int arr[], int start) {
        int size = arr.length;
        Node curr = new Node(arr[start]);
        int left = 2 * start + 1;
        int right = 2 * start + 2;
        if (left < size) {
            curr.leftChild = levelOrderBinaryTree(arr, left);
        }
        if (right < size) {
            curr.rightChild = levelOrderBinaryTree(arr, right);
        }
        return curr;
    }

    public void printBreadthFirst() {

        if (root == null) {
            System.out.println("There is no Tree");
            return;
        }

        ArrayDeque<Node> que = new ArrayDeque<Node>();
        
        que.add(root);
        boolean reverse = true;

        while (!que.isEmpty()) {
            Node curr;
            int levelSize = que.size();
            for (int i = 0; i < levelSize; i++) {
                 curr = que.poll();
                System.out.print(curr.value + " ");
                if (reverse) {
                    if (curr.rightChild != null) {
                        que.add(curr.rightChild);
                    }
                    if (curr.leftChild != null) {
                        que.add(curr.leftChild);
                    }
                    curr  =curr.leftChild;
                    
                   
                 }
                else {
                   
                    if (curr.leftChild != null) {
                        que.add(curr.leftChild);
                    }
                    if (curr.rightChild != null) {
                        que.add(curr.rightChild);
                    }
                    // reverse = ! reverse;
                   
                    // reverse = ! reverse;
                }
               
            }
            
            reverse = ! reverse;
           
           

        }
    }

    public static void main(String[] args) {
        Problem3 p = new Problem3();
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        p.levelOrderBinaryTree(arr);
        p.printBreadthFirst();

    }
}
