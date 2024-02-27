package LinkedList;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    public class Node{
        public int value;
        public Node next;
    }
    public Node createCSLL(int value){
        head = new Node();
        Node node = new Node();
        node.value = value;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return node;

    }
    public static void main(String[] args) {
        CircularSinglyLinkedList csll =  new CircularSinglyLinkedList();
        csll.createCSLL(5);
        System.out.println(csll.head.value);
       
    }
}
