package GroupAnagrams_014;

/**
 */
public class Solution {

    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        Thread mythread1 = new Thread(mythread);
        Thread mythread2 = new Thread(mythread);
        Thread mythread3 = new Thread(mythread);
        Thread mythread4 = new Thread(mythread);
        mythread1.start();
        mythread2.start();
        mythread3.start();
        mythread4.start();
    }

    static class Mythread extends Thread {
        private int num = 10;

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                if (num>0){
                    System.out.println("卖票" + num--);
                }
            }
        }
    }

}