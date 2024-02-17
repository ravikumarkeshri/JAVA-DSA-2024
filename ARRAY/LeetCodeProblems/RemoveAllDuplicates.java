
package LeetCodeProblems;

public class RemoveAllDuplicates {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int size = nums.length;
        if (size == 1) {
            return count = 1;
        }
        if (size == 0) {
            return count = 0;
        }
        count = 1;
        for (int i = 1; i < size; i++) {
            if (nums[i] != nums[i - 1]) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int nums[] = { 1 };
        System.out.println(removeDuplicates(nums));
    }
}
