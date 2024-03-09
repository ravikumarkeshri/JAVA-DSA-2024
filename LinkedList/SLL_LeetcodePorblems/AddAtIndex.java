package LinkedList.SLL_LeetcodePorblems;

public class AddAtIndex {
    // Solution to Singly Linked List - Insert

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

    public Node pop() {
        if (head == null) {
            System.out.println("The SLL does not exist");
            return null;
        }
        Node removeNode;
        Node currentNode;
        if (head == tail) {
            removeNode = head;
            head = tail = null;
        } else {
            currentNode = head;
            while (currentNode.next != tail) {
                currentNode = currentNode.next;
            }
            removeNode = currentNode.next;
            currentNode.next = null;
            tail = currentNode;
        }
        size--;

        return removeNode;

    }

    // Get
    public Node get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    // Insert
    // public boolean insert(int data, int index) {
    // Node newNode = new Node();
    // newNode.value = data;
    // if (index<0 || index >= size) {
    // return false;
    // }
    // if (head == null) {
    // head = newNode;
    // tail = newNode;
    // } else {
    // if (index == 0) {
    // newNode.next = head;
    // head = newNode;
    // } else if (index == 1) {
    // newNode.next = head.next;
    // head.next = newNode;
    // } else if (index == size) {
    // tail.next = newNode;
    // newNode.next = null;
    // tail = newNode;
    // } else {
    // Node tempNode = head;
    // int inx = 0;
    // while (inx < index-1) {
    // tempNode = tempNode.next;
    // inx += 1;
    // }
    // Node nextNode = tempNode.next;
    // tempNode.next = newNode;
    // newNode.next = nextNode;
    // }
    // }
    // size +=1;
    // return true;
    // }
    public boolean insert(int data, int index) {
        Node node = new Node();
        node.value = data;
        if (index < 0 || index > size) {
            return false;
        }
        if (head == null) {
            head = node;
            tail = node;
        } else if (index == 0) {
            node.next = head;
            head = node;
        } else if (index == 1) {
            node.next = head.next;
            head.next = node;
        } else if (index == size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            node.next = curr.next;
            curr.next = node;
        }
        size++;
        return true;

    }

    public String rotate(int number) {
        int index = number;
        if (number < 0) {
            index = number + size;
        }
        if (index < 0 || index >= size) {
            return null;
        }
        
        if (index == 0) {
            return "No Rotate";
        }
        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            return "No Ratation";
        }
       tail.next = head;
       head = curr.next;
       tail = curr;
       curr.next = null;
       
       
       return "Success";

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
        AddAtIndex a = new AddAtIndex();
        a.insertSinglyLinkedList(5);
        a.push(10);
        a.push(12);
        a.push(13);
        a.push(15);
        a.push(18);
        a.printList();
        // boolean result = a.insert(11, 0);
        // String result = a.rotate(2);
        boolean result = a.set(5,123);
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
