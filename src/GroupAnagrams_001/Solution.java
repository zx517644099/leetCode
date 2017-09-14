package GroupAnagrams_001;

import java.util.*;

/**
 *
 * 给定一个数组的字符串，将anagrams组合在一起。
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * return [["ate", "eat","tea"],["nat","tan"],["bat"]]
 * 解题思路定义一个map，循环数组依次取出数组元素
 * 按字母顺序排序作为map的key如果不包含新put一个key
 * 最后按key把该元素放到map里
 *
 *
 */
public class Solution {

    public static void main(String[] args) {
        String[] strs= {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(strs);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        //如果字符串数组为空，直接返回空list
        if (strs.length == 0) return new ArrayList();

        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList());
            }
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }

}
