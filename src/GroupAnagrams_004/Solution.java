package GroupAnagrams_004;

import java.util.ArrayList;

/**
 * Reverse digits of an integer.
 * <p>
 * Example1: x = 123, return 321 Example2: x = -123, return -321
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(reverse(96463243));
    }

    public static int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + (x % 10);
            System.out.println("result          " + result);
            x = x / 10;
            System.out.println("x           " + x);
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                return 0;
        }
        return (int) result;
    }

}
