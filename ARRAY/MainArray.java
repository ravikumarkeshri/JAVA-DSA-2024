import java.util.Arrays;

public class MainArray {
    int arr[] = null;
    public MainArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for(int i = 0; i<arr.length ; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void insert(int location, int valueToBeInserted){
        try {
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Successfully Inserted.");
            }else{
                System.out.println("Already Located");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Invalid index to access array, errro message: "+e);
        }
        
    }
    public void access( int location){
        try {
            System.out.println("Element :"+arr[location]);
        } catch (Exception e) {
            System.out.println("Error Message: "+e);
        }
    }
    public void traversArray(){
        try {
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Array Don't Exist..");
        }
        
    }
    public void search(int searchValue){
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] == searchValue){
                System.out.println("Value found at index: "+ i);
                return;
            }
        }
        System.out.println("Value Not Found..");
    }
    public static void main(String[] args) {
        MainArray mArray = new MainArray(10);
        mArray.insert(0, 12);
        mArray.insert(1, 14);
        mArray.insert(3, 15);
        mArray.insert(0, 13);
        mArray.insert(11, 12);

        // mArray.access(12);
        // mArray.access(1);

        mArray.traversArray();
        mArray.search(15);









        //  codes written below are just for illustration..
        {
            // --> creating an array..
            // int intArray[] = new intArray[3];
            int[] intArray;
            intArray = new int[3];
            intArray[0] = 3;
            intArray[1] = 5;
            intArray[2] = 6;
            // System.out.println(Arrays.toString(intArray));

            String stringArray[] = { "Ravi", "Amit", "Aryan" };
            // System.out.println(Arrays.toString(stringArray));
        }

        // We will work on single Dimension array.

    }
}