package GroupAnagrams_008;

/**
 * Remove Duplicates from Sorted Array
 * 给定一个有序的数组，和一个数，求小于这个数的值有几个
 *
 *
 *
 */
public class Solution {

    public static void main(String[] args) {
        int[] ints = {1, 1, 1, 1};
        String s="a|b|c";
        s.split("\"|\"");
    }

    public int searchInsert(int[] nums, int target) {
        int i = 0;
        for(;i < nums.length;i ++){
            if(nums[i] >= target){
                return i;
            }
        }
        return i;
    }

}
