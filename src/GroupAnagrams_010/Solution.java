package GroupAnagrams_010;

/**
 * 给定数组和值，删除该值的所有实例并返回新的长度。

 不要为另一个数组分配额外的空间，您必须使用常量内存来执行此操作。

 元素的顺序可以改变。 无论你离开新的长度什么都不重要。
 */
public class Solution {

    public static void main(String[] args) {
        int[] ints = {3, 1, 1, 3};
        System.out.println(removeElement(ints,3));
    }

//    public static int removeElement(int[] nums, int val) {
//        int length=nums.length;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==val){
//                length--;
//            }
//        }
//        return length;
//    }
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++){
            System.out.println(nums[j]);
        }
        return i;
    }
}
