package Stack;

public class LinkedListStack {
    Node head;
    int size;

    public class Node {
        int value;
        Node next;

        Node() {
            this.next = null;
        }

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Node creatStack(int value) {
        head = new Node();
        Node node = new Node(value);
        head = node;
        size = 1;
        return head;
    }

    public void push(int value) {
        Node node = new Node(value);
        if (head == null) {
            creatStack(value);
            return;
        } else {
            node.next = head;
            head = node;
            size++;
        }
    }
    public Node pop(){
        if(head == null){
            return null;
        }else{
            Node temp = head;
            head = head.next;
            size--;
            return temp;           
        }
    }
    public Node peek(){
        if(head == null){
            System.out.println("Stack is Empty");
            return null;
        }else{
            return head;
        }
    }
    public void deleteStack(){
        head = null;
        size = 0;
        System.out.println("Stack is Deleted...");
        return;
    }

    public void PirntStack() {
        if(head == null){
            return;
        }
        Node curr = head;
        for (int i = 0; i < size; i++) {
            System.out.print(curr.value);
            if(i!= size-1){
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListStack s = new LinkedListStack();
        s.creatStack(5);
        s.push(3);
        s.push(7);
        s.push(2);
        s.PirntStack();
        // System.out.println("Popped Element: "+s.pop().value);
        System.out.println("Peek Element: "+ s.peek().value);
        s.deleteStack();
        s.PirntStack();
        // System.out.println("Size: "+s.size);

    }
}
