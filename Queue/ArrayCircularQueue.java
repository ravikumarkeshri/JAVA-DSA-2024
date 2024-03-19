public class ArrayCircularQueue {
    int arr[];
    int start;
    int end;
    int size;

    ArrayCircularQueue(int size) {
        this.start = -1;
        this.end = -1;
        this.arr = new int[size];
        this.size = size;
    }

    public boolean isEmpty() {
        if (end == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (end + 1 == start) {
            return true;
        } else if (start == 0 && end + 1 == size) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Array is full...");
            return;
        } else if (isEmpty()) {
            start = 0;
            arr[++end] = value;
        } else {
            if (end + 1 == size) {
                end = 0;
            } else {
                end++;
            }
            arr[end] = value;
        }
    }
    
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else {
            int result = arr[start];
            arr[start] = 0;
            if(start == end){
                start = end = -1;
            }else if(start+1 == size){
                start = 0;
            }else{
                start++;
            }
            return result;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty and returned garbage value");
            return -1;
        }else{
            return arr[start];
        }
    }
    public void deleteQueue(){
        arr = null;
        System.out.println("Queue is deleted succssfully ");
        size=0;
        return;
    }
    public void print(){
        for(int i =0; i<size ;i++){
            System.out.print(arr[i]);
            if(i!=size-1){
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
     ArrayCircularQueue acq = new ArrayCircularQueue(5);
        acq.enQueue(5);
        acq.enQueue(7);
        acq.enQueue(8);
        acq.enQueue(3);
        acq.enQueue(2);
        acq.print();
        System.out.println("Removed: "+acq.deQueue());
        System.out.println("Removed: "+acq.deQueue());
        System.out.println("Removed: "+acq.deQueue());
        acq.enQueue(5);
        acq.enQueue(7);
        acq.enQueue(8);
        
        acq.print();
        System.out.println("Peek value: "+ acq.peek());
        System.out.println("Start: "+acq.start);
        System.out.println("End: "+acq.end);
        acq.deleteQueue();
        


    }
}
