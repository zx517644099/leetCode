package GroupAnagrams_014;

/**
 */
public class Sync_ABC {
    static boolean faig;

    static class Resouse {
        String name;
        String sex;
        boolean faig;
    }

    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        Mythread1 pa = new Mythread1("A", c, a);
        Mythread1 pb = new Mythread1("B", a, b);
        Mythread1 pc = new Mythread1("C", b, c);

        new Thread(pa).start();
        Thread.sleep(10);//保证初始ABC的启动顺序
        new Thread(pb).start();
        Thread.sleep(10);
        new Thread(pc).start();
        Thread.sleep(10);
    }

    static class Mythread1 implements Runnable {
        private String name;
        private Object per;
        private Object sef;

        public Mythread1(String name, Object per, Object sef) {
            this.name = name;
            this.per = per;
            this.sef = sef;
        }

        @Override
        public void run() {
            int i = 10;
            while (i > 0) {
                synchronized (per) {
                    synchronized (sef) {
                        System.out.print(name);
                        i--;
                        sef.notify();
                    }
                    try {
                        per.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}