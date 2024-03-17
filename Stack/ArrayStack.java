package Stack;

public class ArrayStack {
    int arr[];
    int top;

    public ArrayStack(int capacity) {
        this.arr = new int[capacity];
        top = -1;
        System.out.println("Capacity of the Stack: " + capacity);

    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full ");
            return;
        } else {
            arr[++top] = value;

        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Is Empty and returned a garbage value");
            return -1;
        } else {
            return arr[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Is Empty and returned a garbage value");
            return -1;
        } else {
            return arr[top];
        }
    }
    public void deleteStack(){
        arr  = null;
        top = -1;
        System.out.println("Stack is deleted");
    }

    public void printStack() {
        if(top==-1){
            return;
        }
        else{
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i]);
                if (i != 0) {
                    System.out.print(" -> ");
                }
            }
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStack s = new ArrayStack(10);
        s.push(11);
        s.push(12);
        s.push(14);
        s.push(15);
        s.printStack();
        // System.err.println("Removed: "+s.pop());
        // System.err.println("Removed: "+s.pop());
        // System.err.println("Removed: "+s.pop());
        // System.err.println("Removed: "+s.pop());
        System.err.println("Removed: "+s.pop());
        System.out.println("Peek Element: "+s.peek());
        s.deleteStack();
        s.printStack();
        System.out.println("Size: " + (s.top + 1));
    }
}
