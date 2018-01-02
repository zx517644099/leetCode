package GroupAnagrams_014;

public class Digui {
    public static void test(int i){
        if (i == 1) {
            System.out.println("1*1=1 ");
        } else {
            test(i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i +  "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        test(6);
    }
}
