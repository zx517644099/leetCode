package GroupAnagrams_009;

/**
 * Remove Duplicates from Sorted Array
 * 给定一个有序的数组，和一个数，求小于这个数的值有几个
 */
public class Solution {

    public static void main(String[] args) {
        int[] ints = {1, 1, 1, 1};
    }


    public String countAndSay(int n) {
        if (n <= 0) return "";

        String result = "1";
        for (int i = 1; i < n; i++) {
            result = convertUtil(result);
        }
        return result;
    }

    public String convertUtil(String input) {
        int j = 0;
        int counter = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            ++counter;
            if (i == input.length() - 1 || input.charAt(i) != input.charAt(i + 1)) {
                builder.append(counter);
                builder.append(input.charAt(i));
                counter = 0;
            }
        }

        return builder.toString();
    }

}
