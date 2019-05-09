package Test;

/**
 * Created by Fang on 2019/4/30 15:05
 */
public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-1, 2, 3, -4};
        int i = maxSubArray(nums);
        System.out.println(i);
    }

    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        if (len <= 0) {
            return 0;
        }
        int sum = Integer.MIN_VALUE;
        int tempsum = 0;

        for (int i = 0; i < len; i++) {
            if (tempsum < 0) {
                tempsum = nums[i];
            } else {
                tempsum += nums[i];
            }

            if (tempsum > sum) {
                sum = tempsum;
            }

        }


        return sum;
    }

}
