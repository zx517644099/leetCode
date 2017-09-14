package GroupAnagrams_002;

import java.util.*;

/**
 *
 * 给定非负整数，最多可以交换两位数字一次，以获得最大值。 返回您可以获得的最大值。
 * For example, given: 2736,
 * return 7236
 * 把num排序找到最大的数与第一位数交换，
 * 最大数+第1到最大数+第1位+最大数到数的长度
 *
 *
 *
 */
public class Solution {

    public static void main(String[] args) {
        String[] strs= {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(maximumSwap(2376));
    }

    public static int maximumSwap(int num) {
        String string=String.valueOf(num);
        char[] chars=string.toCharArray();
        Arrays.sort(chars);
        String str=String.valueOf(chars);
        int vloutOf=string.indexOf(str.substring(str.length()-1,str.length()));
        if (vloutOf==0){
            return Integer.parseInt(string);
        }
        string=string.substring(vloutOf,vloutOf+1)+string.substring(1,vloutOf)+string.substring(0,1)+string.substring(vloutOf+1,string.length());
        return Integer.parseInt(string);
    }

}
