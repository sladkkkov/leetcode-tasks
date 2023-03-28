package ru.sladkkov.leetcodetasks.task;

public class LeftAndRightSumDifferences2574 {
    public int[] leftRigthDifference(int[] nums) {
        int[] answer = new int[nums.length];

        int leftSum = 0;

        int sum = 0;
        for(int i: nums) {
            sum += i;
        }

        for(int i = 0; i < nums.length; ++i) {

            answer[i] = Math.abs(sum - nums[i] -leftSum - leftSum );
            leftSum += nums[i];
        }
        return answer;
    }
}
