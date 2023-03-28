package ru.sladkkov.leetcodetasks.task;

public class FindTheHighestAltitude1732 {
    public static void main(String[] args) {
         largestAltitude(new int[]{-4,-3,-2,-1,4,3,2});
    }

    public static int largestAltitude(int[] gain) {

        int[] prefixsumArray = new int[gain.length + 1];
        int prefixsumMax = 0;

        for (int i = 1; i <= gain.length; i++) {
            prefixsumArray[i] = prefixsumArray[i - 1] + gain[i - 1];
            System.out.print(prefixsumArray[i]);

            if (prefixsumArray[i] >= prefixsumMax) {
                prefixsumMax = prefixsumArray[i];
            }
        }
        return prefixsumMax;

    }
}
