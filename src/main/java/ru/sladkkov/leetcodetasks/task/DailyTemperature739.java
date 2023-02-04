package ru.sladkkov.leetcodetasks.task;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DailyTemperature739 {

    public static int[] temperatureFirstSolution(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i + 1; j < temperatures.length; j++) {

                if (temperatures[j] > temperatures[i]) {
                    result[i] = j - i;
                    break;
                }
            }
        }
        return result;
    }

    public static int[] temperatureSecondSolution(int[] temperatures) {
        var length = temperatures.length;

        int[] result = new int[length];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!deque.isEmpty() && temperatures[i] >= temperatures[deque.peek()]) {
                deque.pop();
            }

            if (!deque.isEmpty()) {
                result[i] = deque.peek() - i;
            }
            deque.push(i);
        }
        return result;
    }


}
