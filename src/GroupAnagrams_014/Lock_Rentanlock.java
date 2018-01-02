package GroupAnagrams_014;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 */
public class Lock_Rentanlock {
    static class Count {
        int banel;
    }

    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();
        Lock lock = new ReentrantLock();
        c.banel = 100;
        MythreadA pa = new MythreadA(c, lock);
        MythreadB pb = new MythreadB(c, lock);

        new Thread(pa).start();
        new Thread(pb).start();
    }

    static class MythreadA implements Runnable {
        Count c;
        Lock lock;

        MythreadA(Count c, Lock lock) {
            this.c = c;
            this.lock = lock;
        }

        @Override
        public void run() {
            int i = 0;
            while (i < 10) {
                try {
                    lock.lock();
                    c.banel += 1000;
                    System.out.println("父亲挣了1000块，余额还有----" + c.banel);
                    i++;
                } finally {
                    lock.unlock();
                }
            }

        }
    }

    static class MythreadB implements Runnable {
        Count c;
        Lock lock;

        MythreadB(Count c, Lock lock) {
            this.c = c;
            this.lock = lock;
        }

        @Override
        public void run() {
            int i = 0;
            while (i < 10) {
                try {
                    lock.lock();
                    c.banel = c.banel - 1000;
                    System.out.println("儿子花了1000块，余额还有----" + c.banel);
                    i++;
                } finally {
                    lock.unlock();
                }
            }


        }
    }

}