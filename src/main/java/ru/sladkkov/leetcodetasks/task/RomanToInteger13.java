package ru.sladkkov.leetcodetasks.task;

public class RomanToInteger13 {
    /*
    Runtime: 6 ms, faster than 85.47% of Java online submissions for Roman to Integer.
    Memory Usage: 45.2 MB, less than 67.21% of Java online submissions for Roman to Integer.
    */
    public static int romanToInt(String romanNumber) {

        int[] nums = new int[romanNumber.length()];

        for (int i = 0; i < nums.length; i++) {

            switch (romanNumber.charAt(i)) {
                case 'I' -> nums[i] = 1;
                case 'V' -> nums[i] = 5;
                case 'X' -> nums[i] = 10;
                case 'L' -> nums[i]= 50;
                case 'C' -> nums[i] = 100;
                case 'D' -> nums[i] = 500;
                case 'M' -> nums[i] = 1000;
            }


        }

        int sum = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1])  {
                sum -= nums[i];
            } else {
                sum += nums[i];
            }
        }

        return sum + nums[nums.length - 1];

    }

}
