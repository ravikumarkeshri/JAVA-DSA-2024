package LinkedList.SLL_LeetcodePorblems;

public class Rotate {
    public Node head;
    public Node tail;
    public int size;

    public class Node {
        public int value;
        public Node next;
    }

    public Node insertSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert Method SinglyLinkedList
    public void push(int nodeValue) {
        if (head == null) {
            insertSinglyLinkedList(nodeValue);
            return;
        } else {
            Node node = new Node();
            node.value = nodeValue;
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }

    }
    
    public String rotate(int number) {
        int index = number;
        if (number < 0) {
            index = number + size;
        }
        if (index < 0 || index >= size) {
            return null;
        }
        
        if (index == 0) {
            return "No Rotate";
        }
        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            return "No Ratation";
        }
       tail.next = head;
       head = curr.next;
       tail = curr;
       curr.next = null;
       
       
       return "Success";

    }

    public static void main(String[] args) {
        Rotate a = new Rotate();
        a.insertSinglyLinkedList(5);
        a.push(10);
        a.push(12);
        a.push(13);
        a.push(15);
        a.push(18);
        a.printList();
        // boolean result = a.insert(11, 0);
        String result = a.rotate(2);
        // boolean result = a.set(3,123);
        a.printList();
        System.out.println("Result: " + result);
    }
    public void printList() {
        Node curr = head;
        for (int i = 0; i < size; i++) {
            System.out.print(curr.value);
            if (i != size - 1) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }
}
