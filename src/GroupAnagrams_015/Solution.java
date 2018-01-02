package GroupAnagrams_015;

import java.util.Random;

public class Solution {

    public static void main(String[] args) {
        String i = "5832305";

        Long.getLong(i);
//        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int a = 2;
//        System.out.println(biSearch(array, a));
//        Math.random();
//        while (true) {
//            Random random = new Random();
//            int s = random.nextInt(10);
//            System.out.println(s);
//        }
    }


    public static int biSearch(int[] array, int a) {
        int lo = 0;
        int hi = array.length - 1;
        int mid;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (array[mid] == a) {
                return mid + 1;
            } else if (array[mid] < a) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

}
