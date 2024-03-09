package LinkedList.SLL_LeetcodePorblems;

public class PopElement {

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
    public void printList(){
        Node curr = head;
        for(int i= 0; i<size ;i++){
            System.out.print(curr.value);
            if(i!=size-1){
                System.out.print(" -> ");
            }
            curr =curr.next;
        }
    }
    public static void main(String[] args) {
        PopElement p = new PopElement();
        p.insertSinglyLinkedList(5);
        p.push(10);
        p.push(13);
        p.push(15);
        Node temp = p.pop();
        System.out.println(temp.value);
    }

}
