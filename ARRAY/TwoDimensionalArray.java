
import java.util.Arrays;

public class TwoDimensionalArray {

    int[][] arr;

    public TwoDimensionalArray(int rows, int cols) {
        this.arr = new int[rows][cols];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                arr[r][c] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("Value Inserted Successfully");
            } else {
                System.out.println("This cell is already Occupied...");
            }
        } catch (Exception e) {
            System.out.println("Your Input is out of range...\nError Message :" + e);
        }

    }

    public void accessCell(int row, int col) {
        System.out.println("Accessing the row " + row + " and col " + col);
        try {
            System.out.println("Cell value : " + arr[row][col]);
        } catch (Exception e) {
            System.out.println("Your Input is out of range...\nError Message :" + e);
        }
    }

    public void traverseArray() {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
    public void search(int value){
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                if(arr[r][c]== value){
                    System.out.println("found at row: "+r +" col: "+c);
                    return;
                }
            }
           
        }
        System.out.println("Value Not found..");
    }

    public static void main(String[] args) {
        TwoDimensionalArray tArray = new TwoDimensionalArray(2, 2);
        System.out.println(Arrays.deepToString(tArray.arr));
        tArray.insert(1, 0, 10);
        // tArray.accessCell(1, 0);
        tArray.traverseArray();

        tArray.search(10);
        // System.out.println(Arrays.deepToString(tArray.arr));

        // codes written below are just for illustration..
        {

            // System.out.println("hello world...");

            // Step 1- declare
            int[][] int2DArray;

            // Step 2 - instantiate
            int2DArray = new int[2][2];

            // Step 3 - initialize

            int2DArray[0][0] = 1;
            int2DArray[0][1] = 2;
            int2DArray[1][0] = 3;
            int2DArray[1][1] = 4;
            // System.out.println(Arrays.deepToString(int2DArray));

            // another method to create a 2D Array...
            String[][] string2DArray = { { "a", "b" }, { "c", "d" } };
            // System.out.println(Arrays.deepToString(string2DArray));
        }

    }
}
