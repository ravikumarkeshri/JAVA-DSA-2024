package LinkedList;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    private class Node {
        public int value;
        public Node next;
    }

    public Node createSinglyLinkedList(int value) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = value;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int value, int location) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            createSinglyLinkedList(value);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            tempNode.next = node;
            node.next = tempNode.next;
        }
        size++;
    }

    public void traverseLinkedList (){
        if(head == null){
            System.out.println("Linked List is Empty");
        }else{
            Node curr = head;
            for(int i = 0; i<size ; i++){
                System.out.print(curr.value+" ");
                if(i!= size-1){
                    System.out.print("-> ");
                }
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedList sLL = new SingleLinkedList();
        sLL.createSinglyLinkedList(5);
        // System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 0);
        sLL.insertInLinkedList(7, 0);
        sLL.insertInLinkedList(8, 0);
        sLL.insertInLinkedList(9, 0);
        // System.out.println(sLL.tail.value);
        sLL.traverseLinkedList();
    }
}
