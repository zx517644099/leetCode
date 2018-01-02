package GroupAnagrams_013;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 给定一个整数，将其转换为罗马数字。
 * <p>
 * 输入保证在1到3999之间
 */
public class Solution {

    public static void main(String[] args) {
        UUID.randomUUID();
//        System.out.println(intToRoman(122));
//        String[] s = {"1", "2", "3"};
        System.out.println(UUID.randomUUID());
        Map map = new HashMap<>();
        map.put("", "1");
        map.put("1", "");
        map.put(" ", "");
        map.put(null, 1);

        BigDecimal a = new BigDecimal(10);
        BigDecimal b = new BigDecimal(14);
        System.out.println(map.get(null));

        System.out.println(subS("asdfccdefs","sfwsdasdfcdef"));
        System.out.println(strStr("hellp","el"));
    }
    public static int strStr(String haystack, String needle) {
       return haystack.indexOf(needle);
    }
    private static int get() {
        int i = 10;
        try {
            i += 10;
        } catch (Exception e) {

        } finally {
            System.out.println("finally");
        }
        return i;
    }

    public static String intToRoman(int num) {
        String digitsRoman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int digits[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (num > 0) {
            if (num - digits[i] >= 0) {
                sb.append(digitsRoman[i]);
                num -= digits[i];
            } else {
                i++;
            }
        }
        return sb.toString();
    }

    public static String subS(String s1, String s2) {
        String max = s1.length() >= s2.length() ? s1 : s2;
        String min = s1.length() >= s2.length() ? s2 : s1;
        int l = 0;
        String s = "";
        for (int i = 0; i < min.length(); i++) {
            for (int j = i + 1; j <= min.length(); j++) {
                if (max.contains(min.substring(i, j)) && j - i > l) {
                    l = j - i;
                    s = min.substring(i, j);
                }
            }
        }
        return s;
    }
}
