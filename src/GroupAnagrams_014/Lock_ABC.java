package GroupAnagrams_014;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 */
public class Lock_ABC {
    static Lock lock = new ReentrantLock();
    static int state = 0;//通过state的值来确定是否打印

    public static void main(String[] args) throws InterruptedException {
        MythreadA pa = new MythreadA();
        MythreadB pb = new MythreadB();
        MythreadC pc = new MythreadC();

        new Thread(pa).start();
        new Thread(pb).start();
        new Thread(pc).start();
    }

    static class MythreadA implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10;) {
                try {
                    lock.lock();
                    while (state % 2 == 0) {
                        System.out.println("A");
                        state++;
                        i++;
                    }
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    static class MythreadB implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10;) {
                try {
                    lock.lock();
                    while (state % 3 == 1) {
                        System.out.println("B");
                        state++;
                        i++;
                    }
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    static class MythreadC implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10;) {
                try {
                    lock.lock();
                    while (state % 3 == 2) {
                        System.out.println("C");
                        state++;
                        i++;
                    }
                } finally {
                    lock.unlock();
                }
            }
        }
    }

}