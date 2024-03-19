public class ArrayQueue {
    int arr[];
    int start, end, size;

    public ArrayQueue(int capacity) {
        arr = new int[capacity];
        start = -1;
        end = -1;
        size = 0;
    }

    public boolean isEmpty() {
        if (start == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (end == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        } else if (isEmpty()) {
            start = 0;
            arr[++end] = value;
        } else {
            arr[++end] = value;
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty & Garbage Return");
            return Integer.MIN_VALUE;
        } else {
            int removed = arr[start++];
            if (start > end) {
                start = end = -1;
            }
            return removed;
        }
    }
    public int peek(){
        if(!isEmpty()){
            return arr[start];
        }else{
            System.out.println("Queue is Empty...");
            return  -1;
        }
    }

    public void printQueue() {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i != end) {
                System.out.print(" <- ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(5);
        q.enQueue(5);
        q.enQueue(4);
        q.enQueue(3);
        q.enQueue(9);
        q.enQueue(2);
        q.enQueue(7);
        q.printQueue();
        System.out.println("Removed Value: " + q.deQueue());
        q.printQueue();
        System.out.println("peek: "+q.peek());
        System.out.println("Front: " + q.start);
        System.out.println("End: " + q.end);
    }
}
