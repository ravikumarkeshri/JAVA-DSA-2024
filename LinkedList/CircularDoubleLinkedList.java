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
        if(location<0){
            System.out.println("location can not be negative");
            return;
        }
        Node node  = new Node(value);
        if(location == 0){
           
            node.next = head;
            node.prev= null;
            head.prev = node;
            head = node;
            tail.next = head;
            
        }else if(location >= size){
           
            node.prev = tail;
            node.next = null;
            tail.next = node;
            tail = node;
            tail.next = head;
            
        }else{
            Node curr = head;
            for(int i =0; i<location-1; i++){
                 curr = curr.next;
            }
            node.next = curr.next;
            node.prev = curr;
            curr.next = node;
            curr.next.next.prev = node; 
           

        }
        size++;
        
    }
    public void deleteNode(int location){
        if(head == null){
            System.out.println("List is already Empty");
            return;
        }
        if(location == 0){
            head = head.next;
            head.prev = null;
            tail.next = head;
            
        }
        else if(location >= size){
            tail = tail.prev;
            tail.next = head;
        }else{
            Node curr = head;
            for(int i = 0; i<location-1; i++){
                curr = curr.next;
            }
            curr.next = curr.next.next;
            curr.next.prev = curr;
        }
        size--;
        
    }
    public void deleteEntireCDLL(){
        if(head == null){
            System.out.println("List is already Empty");
            return;
        }
        head = null;
        tail.next = null;
        tail = null;
        size =0;
        System.out.println("Entire List is Deleted");
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
    public void searchNode(int value){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        for(int i = 0; i<size; i++){
            if(curr.value == value){
                System.out.println("value found at index "+ i);
                return;
            }
            curr = curr.next;
        }
        System.out.println("value is not present");
        return;
    }
    public static void main(String[] args) {
        CircularDoubleLinkedList cd  = new CircularDoubleLinkedList();
        cd.createList(5);
        // System.out.println(cd.head.value);
        cd.insertNode(2, 0);
        cd.insertNode(4, 0);
        cd.insertNode(3, 1);
        cd.traverse();
        cd.searchNode(2);
        // cd.deleteNode(2);
        // cd.deleteEntireCDLL();
        cd.traverse();
        System.out.println("Head value = "+ cd.head.value);
        System.out.println("Tail value = "+ cd.tail.value);
        System.out.println("Size = "+ cd.size);
        System.out.println("hello");
        System.out.println();
    }
}
