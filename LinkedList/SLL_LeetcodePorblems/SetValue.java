package LinkedList.SLL_LeetcodePorblems;

public class SetValue {
    


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
    
    public boolean set(int index, int value) {
        if(index<0 || index>size){
            return false;
        }
        if(index == 0){
            head.value = value;
            return true;
        }
        Node curr = head;
        for(int i = 0; i<index;i++){
            curr= curr.next;
        }
        
       curr.value = value;
       return true;
      }


    public static void main(String[] args) {
        SetValue a = new SetValue();
        a.insertSinglyLinkedList(5);
        a.push(10);
        a.push(12);
        a.push(13);
        a.push(15);
        a.push(18);
        a.printList();
        // boolean result = a.insert(11, 0);
        // String result = a.rotate(2);
        boolean result = a.set(4,123);
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


