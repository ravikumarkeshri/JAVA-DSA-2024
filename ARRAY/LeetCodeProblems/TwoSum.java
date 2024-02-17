package LeetCodeProblems;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
       
        for(int i = 0; i<size;i++){
            for(int j = i+1; j<size; j++){
                if(nums[i]+nums[j] == target){
                    return new int[] { i, j };
                }
            }
        }

        throw new IllegalArgumentException("No two sum solution found");
    }
    public static void main(String[] args) {
        int[] nums = {11,15,2,7};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
