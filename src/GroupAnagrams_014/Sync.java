package GroupAnagrams_014;

/**
 */
public class Sync {
    static boolean faig;

    static class Resouse {
        String name;
        String sex;
        boolean faig;
    }

    public static void main(String[] args) {
        Resouse resouse = new Resouse();
        Mythread1 mythread1 = new Mythread1(resouse);
        Mythread2 mythread2 = new Mythread2(resouse);
        new Thread(mythread1).start();
        new Thread(mythread2).start();
    }

    static class Mythread1 implements Runnable {
        private int num = 10;
        private Resouse resouse;

        public Mythread1(Resouse resouse) {
            this.resouse = resouse;
        }

        @Override
        public void run() {
            int i = 0;
            while (true) {
                synchronized (resouse) {
                    resouse.faig = true;
                    if (resouse.faig) {
                        resouse.notify();
                        if (i % 2 == 0) {
                            resouse.name = "张三";
                            resouse.sex = "男";
                        } else {
                            resouse.name = "李四";
                            resouse.sex = "女";
                        }
                        i++;
                        resouse.faig = false;
                    } else {
                        try {
                            resouse.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    static class Mythread2 implements Runnable {
        private int num = 10;
        private Resouse resouse;

        public Mythread2(Resouse resouse) {
            this.resouse = resouse;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (resouse) {
                    if (!resouse.faig) {
                        resouse.notify();
                        System.out.println("结果：" + resouse.name + "-------" + resouse.sex);
                        resouse.faig=true;
                    }
                    try {
                        resouse.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}