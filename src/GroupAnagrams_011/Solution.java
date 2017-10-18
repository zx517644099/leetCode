package GroupAnagrams_011;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 给定数组和值，删除该值的所有实例并返回新的长度。
 * <p>
 * 不要为另一个数组分配额外的空间，您必须使用常量内存来执行此操作。
 * <p>
 * 元素的顺序可以改变。 无论你离开新的长度什么都不重要。
 */
public class Solution {

    public static void main(String[] args) {
//        int[] ints = {2, 1, 1, 3};
//        System.out.println(twoSum(ints, 3));
        reverse();
        int[] ints1 = {2, 3, 4, 1, 5, 2, 6, 7};
        boolean falg = true;
        for (int i = 0; i < ints1.length && falg; i++) {
            for (int j = i + 1; j < ints1.length - 1; j++) {
                int temp;
                falg = false;
                if (ints1[i] < ints1[j]) {
                    temp = ints1[j];
                    ints1[j] = ints1[i];
                    ints1[i] = temp;
                    falg = true;
                }
            }
        }
        System.out.println(ints1);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = {0, 0};
        if (nums.length == 0) {
            return result;
        }
        int one = 0;
        int two = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    one = i;
                    two = j;
                    break;
                }
            }
        }
        result[0] = one;
        result[1] = two;
        System.out.println(one + "" + two);
        return result;
    }

    public static void reverse() {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> templist = new LinkedList<>();
        int i = 0;
        while (i < 6) {
            list.add(i);
            i++;
        }
        Iterator<Integer> it = list.iterator();
        int m;
        while (it.hasNext() && i >= 0) {
            m = it.next();
            templist.addFirst(m);
            i--;
        }
        list = templist;
        System.out.println(list);
    }
}
