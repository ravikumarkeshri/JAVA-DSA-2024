package LinkedList.Circular_SLL_LeetcodePorblems;

class Node {
    public int value;
    public Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }

}

public class CreateCSLL {
    public Node head;
    public Node tail;
    public int size;

    CreateCSLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void append(int value) {
        Node node = new Node(value);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
            node.next = node;
        } else {
            this.tail.next = node;
            node.next = this.head;
            this.tail = node;
        }
        size++;

    }
    public void prepend(int value){
        Node node  = new Node(value);
        if(size == 0){
            head = node;
            tail = node;
            node.next = node;
        }
        else{
            node.next = head;
            head = node;
            tail.next = node;
            size++;
        }

    }

    public static void main(String[] args) {
        CreateCSLL c = new CreateCSLL();

        c.append(5);
        c.append(4);
        c.prepend(10);
        System.out.println(c.size);
    }
}
