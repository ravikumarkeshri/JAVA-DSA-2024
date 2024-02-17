package LeetCodeProblems;

import java.util.Arrays;

public class RemoveDuplicate {
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int array[] = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                array[index++] = arr[i];
            }
        }
        return Arrays.copyOf(array, index);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(removeDuplicates(arr)));

    }
}
