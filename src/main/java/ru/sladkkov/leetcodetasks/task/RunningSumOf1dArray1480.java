package ru.sladkkov.leetcodetasks.task;

public class RunningSumOf1dArray1480 {
    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i];
        }

        return nums;
    }
}
