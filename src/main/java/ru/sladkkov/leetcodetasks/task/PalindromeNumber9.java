package ru.sladkkov.leetcodetasks.task;

public class PalindromeNumber9 {

    /*
    Runtime: 29 ms, faster than 11.19% of Java online submissions for Palindrome Number.
    Memory Usage: 47 MB, less than 10.87% of Java online submissions for Palindrome Number.
    */
    public static boolean firstSolution(int x) {
        return x >= 0 && String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
    }

    /*
    Runtime: 13 ms, faster than 71.76% of Java online submissions for Palindrome Number.
    Memory Usage: 44.6 MB, less than 53.41% of Java online submissions for Palindrome Number.
    */
    public static boolean secondSolution(int x) {

        if (x < 0) {
            return false;
        }

        int digit = x;
        int reverse = 0;

        while (digit != 0) {
            int remainder = digit % 10;
            reverse = reverse * 10 + remainder;
            digit = digit / 10;
        }

        return x == reverse;
    }

    /*
    Runtime: 9 ms, faster than 98.03% of Java online submissions for Palindrome Number.
    Memory Usage: 41.6 MB, less than 95.21% of Java online submissions for Palindrome Number.
    */
    public static boolean thirdSolution(int x) {

        if (x >= 0 && x < 10) {
            return true;
        }
        if (x < 0) {
            return false;
        }

        int digit = x;
        int reverse = 0;
        int remainder;

        while (digit != 0) {
            remainder = digit % 10;
            reverse = reverse * 10 + remainder;
            digit = digit / 10;
        }

        return x == reverse;
    }

    public static boolean forthSolution(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;

        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }
}
