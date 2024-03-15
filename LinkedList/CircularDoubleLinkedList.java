package LinkedList;

public class CircularDoubleLinkedList { 
    public Node head;
    public Node tail;
    public int size;
    public class Node {
        public int value;
        public Node next;
        public Node prev;
        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
        public Node(int value ){
            this.value = value;
            this.next = null;
            this.prev = null;
        }
        public Node(){
            this.value = 0;
        }
    }
    public Node createList(int value){
        head = new Node();
        Node node = new Node(value);
        tail = node;
        head = node;
        size = 1;
        return head;
    }
    public void insertNode(int value , int location){
        if(head== null){
            createList(value);
            return;
        }
        if(location == 0){
            Node node  = new Node(value);
            node.next = head;
            node.prev= null;
            head.prev = node;
            head = node;
            tail.next = head;
            size++;
        }
        
    }
    public void traverse(){
        Node curr= head;
        for(int i =0 ; i<size; i++){
            System.out.print(curr.value);
            if(i!=size-1){
                System.out.print(" => ");
            }
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CircularDoubleLinkedList cd  = new CircularDoubleLinkedList();
        cd.createList(5);
        // System.out.println(cd.head.value);
        cd.insertNode(2, 0);
        cd.insertNode(4, 0);
        cd.traverse();;
        
        System.out.println("hello");
        System.out.println();
    }
}
