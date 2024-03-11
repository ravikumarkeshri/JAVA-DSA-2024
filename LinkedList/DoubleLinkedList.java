package LinkedList;

public class DoubleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    private class Node {
        public int value;
        public Node next;
        public Node prev;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }

        Node() {
            this.next = null;
            this.prev = null;

        }
    }

    public Node createDLL(int value) {
        head = new Node();
        Node node = new Node(value);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertNode(int value, int location) {
        Node node = new Node(value);
        if (head == null) {
            createDLL(value);
            return;
        } else if (location == 0) {
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
            size++;
        } else if (location >= size) {
            node.next = null;
            node.prev = tail;
            tail.next = node;
            tail = node;
            size++;
        } else {
            Node curr = head;
            for (int i = 0; i < size - 1; i++) {
                curr = curr.next;
            }
            node.next = curr.next;
            curr.next.prev = node;
            node.prev = curr;
            curr.next = node;
            size++;


        }

    }
    public void printList(){
        Node curr = head;
        for(int i= 0; i<size; i++){
            System.out.print(curr.value);
            if(i!= size -1 ){
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.createDLL(5);
        dll.insertNode(2, 0);
        dll.insertNode(6, 0);
        dll.insertNode(7, 3);
        dll.insertNode(3, 5);
        // System.out.println(dll.head.value);
        dll.printList();
        System.out.println("Size: " +dll.size);


    }
}
