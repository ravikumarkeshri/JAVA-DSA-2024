package LinkedList;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public class Node {
        public int value;
        public Node next;
    }

    public Node createCSLL(int value) {
        head = new Node();
        Node node = new Node();
        node.value = value;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return node;

    }

    public void insertNode(int value, int location) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            createCSLL(value);
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            int index = 0;
            Node curr = head;
            while (index < location - 1) {
                curr = curr.next;
                index++;
            }
            node.next = curr.next;
            curr.next = node;
        }
        size++;

    }
    public void deleteNode(int location){
        if(head == null){
           System.out.println("List is Empty");
           return;
        }
        else if(location == 0){
            head = head.next;
            size--;
            if(size==0){
                tail.next = head;
            }
        }else if(location>=size){
            Node curr = head;
            for(int i = 0; i<size-1; i++){
                curr = curr.next;
            }
            if(tail == head){
                head = tail =null;
                size--; 
                return;
            }
            curr.next = tail;
            tail = curr;
            tail.next= head;
            size--;
        }else {
            Node curr = head;
            for(int i = 0 ; i<location-1; i++){
                curr = curr.next;
            }
            if(tail == head){
                head = tail = null;
                size--;
                return;
            }
            curr.next = curr.next.next;
            size--;
        }
    }
    public void deleteEntireCLL(){
        if(head == null){
            System.out.println("List Does not exist");
            return;
        }
        head = null;
        tail.next= null;
        tail = null;
        size = 0;
        System.out.println("List Deleted");
    }
        

    public void traverseCircularLinkedList() {
        Node curr = head;
        for (int i = 0; i < size; i++) {
            System.out.print(curr.value + " ");
            if (i != size-1) {
                System.out.print("-> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public void searchNode(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.value == value) {
            System.out.println("value found at index 0");
            return;
        }
        Node curr = head;
        for(int i = 0; i<size ; i++){
            if(curr.value == value){
                System.out.println("Value Found at index: "+i);
                return;
            }
            curr = curr.next;
        }

    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        csll.insertNode(3, 1);
        csll.insertNode(4, 3);
        csll.insertNode(5, 4);
        csll.insertNode(6, 5);
        csll.insertNode(7, 6);
        csll.insertNode(8, 7);
        csll.insertNode(12, 6);

        // System.out.println(csll.head.value);
        csll.traverseCircularLinkedList();
        // csll.searchNode(12);
        csll.deleteNode(3);
        csll.deleteEntireCLL();
        csll.traverseCircularLinkedList();

    }
}
