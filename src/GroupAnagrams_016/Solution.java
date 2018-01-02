package GroupAnagrams_016;

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 2, 2, 2, 2, 3, 3};
        System.out.println(test(array));
    }


    public static int test(int[] array) {
        int maxTime = 0;//出现的次数
        int maxEle = array[array.length / 2];//出现次数最大的元素

        for (int i = array.length / 2; i > 0; i--) {
            if (array[i] == maxEle) {
                maxTime++;
            } else {
                break;
            }
        }
        for (int i = array.length / 2; i < array.length; i++) {
            if (array[i] == maxEle) {
                maxTime++;
            } else {
                break;
            }
        }
        if (maxTime > array.length / 2) {
            return maxEle;
        } else {
            return -1;
        }
    }

}
