public class LinkedListQueue {
    public Node head;
    public Node tail;
    public int size;
    public class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
        Node(){
          
        }

    }
    public Node createNode(int value){
        head = new Node();
        Node node = new Node(value);
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    public void enQueue(int value){
        if(head == null){
            createNode(value);
            return;
        }else{
            Node node = new Node(value);
            tail.next = node;
            tail = node;
            size++;
        }
    }
    public int deQueue(){
        if(head == null){
            System.out.println("Queue is Empty and returned garbage value");
            return Integer.MAX_VALUE;
        }else{
            int removed = head.value;
            head = head.next;
            size--;
            return removed;
        }
    }
    public void deleteQueue(){
        head =null;
        tail = null;
        
        System.out.println("Queue is Deleted...");
        size =0;
        return;
    }
    public void printQueue(){
        if(size==0){
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        for(int i = 0; i<size; i++){
            System.out.print(curr.value);
            if(i!=size-1){
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
         queue.createNode(5);
         queue.enQueue(4);
         queue.enQueue(8);
         queue.enQueue(3);
         queue.enQueue(7);
         queue.printQueue();
         System.out.println("Removed: "+queue.deQueue());
         queue.printQueue();
         System.out.println("Head: "+queue.head.value);
         System.out.println("Tail: "+queue.tail.value);
         System.out.println("Size: "+queue.size);
         queue.deleteQueue();
         queue.printQueue();
         

         
        

    }
}
