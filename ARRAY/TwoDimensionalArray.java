
import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        System.out.println("hello world...");

        // Step 1- declare
        int[][] int2DArray;

        // Step 2 - instantiate
        int2DArray = new int[2][2];

        // Step 3 - initialize

        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;
        System.out.println(Arrays.deepToString(int2DArray));

        // another method to create a 2D Array...
        String[][] string2DArray = { { "a", "b" }, { "c", "d" } };
        System.out.println(Arrays.deepToString(string2DArray));

    }
}
