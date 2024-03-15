package LinkedList;

public class DoubleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    private class Node {
        public int value;
        public Node next;
        public Node prev;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }

        Node() {
            this.next = null;
            this.prev = null;

        }
    }

    public Node createDLL(int value) {
        head = new Node();
        Node node = new Node(value);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertNode(int value, int location) {
        Node node = new Node(value);
        if (head == null) {
            createDLL(value);
            return;
        } else if (location == 0) {
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;

        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            node.prev = tail;
            tail.next = node;
            tail = node;

        } else {
            Node curr = head;
            for (int i = 0; i < location - 1; i++) {
                curr = curr.next;
            }
            node.prev = curr;
            node.next = curr.next;
            curr.next = node;
            curr.next.prev = node;
        }
        size++;

    }

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("list is Empty");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            }
            head = head.next;
            head.prev = null;
            size--;

        } else if (location >= size) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
            } else {
                tail = tail.prev;
                tail.next = null;
                size--;
            }

        } else {
            Node curr = head;
            for (int i = 0; i < location - 1; i++) {
                curr = curr.next;

            }
            curr.next = curr.next.next;
            curr.next.prev = curr;
            size--;
        }
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

    public boolean searchvalue(int value) {
        if (head == null) {
            System.out.println("List is Empty");
            return false;
        } else {
            Node curr = head;
            for (int i = 0; i < size; i++) {
                if (curr.value == value) {
                    System.out.println("Found at index : " + i);
                    return true;
                } else {
                    curr = curr.next;
                }
            }
        }
        return false;
    }

    public void deleteEntireList() {
        Node curr = head;
        for (int i = 0; i < size; i++) {
            curr.prev = null;
            curr = curr.next;

        }
        head = null;
        tail = null;
        size = 0;
        System.out.println("Enitre list deleted");
    }

    public void printReverse() {
        if (head != null) {
            Node curr = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(curr.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                curr = curr.prev;

            }
        } else {
            System.out.println("List does not exists");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.createDLL(5);
        dll.insertNode(2, 0);
        dll.insertNode(6, 1);
        dll.insertNode(7, 2);
        dll.insertNode(3, 5);
        dll.insertNode(10, 4);
        // System.out.println(dll.head.value);
        dll.printList();
        // dll.printReverse();
        // System.out.println("Size: " +dll.size);

        // boolean found = dll.searchvalue(7);
        // System.out.println("Found: "+found);

        // dll.deleteNode(1);
        dll.deleteEntireList();
        dll.printList();

    }
}
