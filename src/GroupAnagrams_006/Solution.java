package GroupAnagrams_006;

/**
 * Remove Duplicates from Sorted Array
 * 给定一个有序的数组，删除重复的元素，返回新的长度
 *
 *
 *
 */
public class Solution {

    public static void main(String[] args) {
        int[] ints = {1, 1, 1, 1};
        System.out.println(removeDuplicates(ints));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
            }
        }
        return i + 1;
    }

}
