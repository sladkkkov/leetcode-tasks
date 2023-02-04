package ru.sladkkov.leetcodetasks;

import java.util.*;

public class TwoSum1 {

    public static int[] twoNumberOnSolutionFirst(int[] numbers, int target) {

        for (int j = 0; j < numbers.length; j++) {

            for (int k = 0; k < numbers.length; k++) {

                if (numbers[j] + numbers[k] == target && j != k) {
                    return new int[]{j, k};
                }
            }
        }
        return new int[0];
    }


    public static int[] twoNumberOnSolutionSecond(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int help = target - numbers[i];
            if (map.containsKey(help)) {
                return new int[]{map.get(help), i};
            }

            map.put(numbers[i], i);
        }
        return new int[0];
    }
}
