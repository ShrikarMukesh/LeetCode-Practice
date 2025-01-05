package main.java.subarray;

public class MaxSubArrayWithIndices {

    public static int[] maxSubArrayWithIndices(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0, tempStart = 0, end = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        return new int[]{maxSum, start, end};
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] result = maxSubArrayWithIndices(nums);

        System.out.println("Maximum Subarray Sum: " + result[0]); // Output: 6
        System.out.println("Subarray Indices: [" + result[1] + ", " + result[2] + "]");
    }
}
