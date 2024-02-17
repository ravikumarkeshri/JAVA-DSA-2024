package LeetCodeProblems;

public class MissingNumber {
    public static int findMissingNumberInArray(int[] array) {
        int sum = 0;
        int n = array.length;
        int last = array[n-1];
        int actualSum = (last * (last + 1)) / 2;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        int missing = actualSum - sum;
        return missing;
    }

    public static void main(String[] args) {
        // System.out.println("Hello");
       int[] myArray = {1,2,3,4,6};
       System.out.println( findMissingNumberInArray(myArray)); // 5
    }
}