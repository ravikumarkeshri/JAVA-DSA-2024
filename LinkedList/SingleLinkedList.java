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
    public boolean searchNode(int value){
        if(head == null){
            return false;
        }
        Node curr = head;
        for(int i= 0; i<size ;i++){
            if(curr.value == value){
                System.out.println("Found at index : "+i);
                return true;
            }
            curr = curr.next;
        }
        System.out.println("Not found");
        return false;
    }
    public void deleteNode(int location){
        if(head == null){
            System.out.println("List does not exist...");
            return ;
        }else if(location == 0){
             head = head.next;
             size--;
             if(size == 0){
               head = tail = null;
             }
        }else if(location>= size){
            Node temp = head;
            for(int i = 0; i<size-1 ;i++){
                temp = temp.next;
            }
            if(temp == head){
                tail = head = null;
                size--;
                return;
            }
            temp.next = null;
            tail = temp;
            size--;
        }else{
            Node temp = head;
            for(int i =0; i<location-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
    public void deleteSingleLinkedList(){
        head = null;
        tail = null;
        System.out.println("Single Linked List Deleted");
    }

    public static void main(String[] args) {
        SingleLinkedList sLL = new SingleLinkedList();
        sLL.createSinglyLinkedList(5);
        // System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 1);
        sLL.insertInLinkedList(7, 2);
        sLL.insertInLinkedList(8, 3);
        sLL.insertInLinkedList(9, 4);
        // System.out.println(sLL.tail.value);
        sLL.traverseLinkedList();
        System.out.println(sLL.searchNode(8));
        // sLL.deleteNode(10);
        // sLL.deleteSingleLinkedList();
        // sLL.traverseLinkedList();
    }
}
