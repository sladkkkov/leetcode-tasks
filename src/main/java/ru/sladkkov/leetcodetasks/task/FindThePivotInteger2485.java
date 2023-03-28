package ru.sladkkov.leetcodetasks.task;

public class FindThePivotInteger2485 {
    public int pivotInteger(int n) {
        int leftSum = 0;
        int sum = n * (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            leftSum += i;
            if (leftSum == sum - leftSum + i) return i;
        }

        return -1;
    }
}
