package LinkedList.SLL_LeetcodePorblems;

public class PushElement {
    public class Node{
        public int value;
        public Node next;
    }
    public Node head;
    public Node tail;
    public int size ;
    public Node createList(int value){
        head = new Node();
        Node node = new Node();
        node.value = value;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
        
    }
    // public void addHead(int value){
    //     Node node = new Node();
    //     node.value = value;
    //     node.next = head;
    //     head = node;
    //     size++;
    // }
    public void push(int value){
        if(head == null){
            createList(value);
            return;
        }else{
            Node node = new Node();
            node.value = value;
            node.next =null;
            tail.next = node;
            tail = node;
            size++;
        
        } 
    }
    public void printList (){
        Node curr = head;
        for(int i =0; i<size ; i++){
            System.out.print(curr.value);
            if(i !=size-1){
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        PushElement e = new PushElement();
        e.createList(5);
        e.push(10);
        e.printList();
    }
}
