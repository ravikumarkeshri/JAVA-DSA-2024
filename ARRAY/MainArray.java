import java.util.Arrays;

public class MainArray{
    public static void main(String[] args) {
        // -->  creating an array..
        // int intArray[] = new intArray[3];
        int[] intArray;
        intArray = new int[3];
        intArray[0] = 3;
        intArray[1] = 5;
        intArray[2] = 6;
        // System.out.println(Arrays.toString(intArray));

        String stringArray[] = {"Ravi","Amit","Aryan"};
        System.out.println(Arrays.toString(stringArray));
    }
}