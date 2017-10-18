package GroupAnagrams_007;

/**
 Java code for Reverse String II
 */
public class Solution {

    public static void main(String[] args) {
        int[] ints = {1, 1, 1, 1};
    }

    public String reverseStr(String s, int k) {
        if (s == null || s.length() == 0) {
            return s;
        }

        int remain = s.length() % (2 * k);
        int start = 0;
        StringBuilder builder = new StringBuilder();
        while (start < s.length() - remain) {
            for (int i = start + k - 1; i >= start; i--) {
                builder.append(s.charAt(i));
            }
            for (int i = start + k; i < start + 2 * k; i++) {
                builder.append(s.charAt(i));
            }
            start += 2 * k;
        }

        int end = s.length() - 1;
        if (remain >= k) {
            end = start + k - 1;
        }
        for (int i = end; i >= start; i--) {
            builder.append(s.charAt(i));
        }
        start = end + 1;
        while (start < s.length()) {
            builder.append(s.charAt(start++));
        }
        return builder.toString();
    }

}
