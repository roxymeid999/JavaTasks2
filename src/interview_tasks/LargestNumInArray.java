package interview_tasks;

import java.util.Arrays;

public class LargestNumInArray {
    public static void main(String[] args) {

        int[] nums = {99, 5, 34, 7, 5, 6, 9, 88, 9, 66, 75, 3, 98, 12};
        int largestNum = nums[0];
        for (int each : nums) {
            if (largestNum <each){
                largestNum=each;
            }
        }
        System.out.println(largestNum);

        Arrays.sort(nums);
        System.out.println(nums[nums.length-1]);
    }
}
