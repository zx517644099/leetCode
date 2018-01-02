package GroupAnagrams_014;

public class TriAngle {
    private double dibain;
    private double leftbian;
    private double rightbian;
    private double xiankuan;

    public TriAngle(double dibain, double leftbian, double rightbian) {
        this.dibain = dibain;
        this.leftbian = leftbian;
        this.rightbian = rightbian;
    }

    public TriAngle(double dibain, double leftbian, double rightbian, double xiankuan) {
        this.dibain = dibain;
        this.leftbian = leftbian;
        this.rightbian = rightbian;
        this.xiankuan = xiankuan;
    }

    public double getDibain() {
        return dibain;
    }

    public void setDibain(double dibain) {
        this.dibain = dibain;
    }

    public double getLeftbian() {
        return leftbian;
    }

    public void setLeftbian(double leftbian) {
        this.leftbian = leftbian;
    }

    public double getRightbian() {
        return rightbian;
    }

    public void setRightbian(double rightbian) {
        this.rightbian = rightbian;
    }

    public double getXiankuan() {
        return xiankuan;
    }

    public void setXiankuan(double xiankuan) {
        this.xiankuan = xiankuan;
    }

    public double getArea() {
        double s = (dibain + leftbian + rightbian) / 2;
        return Math.sqrt(s * (s - dibain) * (s - leftbian) * (s - rightbian));
    }

    public void getBian() {
        System.out.println("底边长" + dibain + "左边长" + leftbian + "右边长" + rightbian + "线宽" + xiankuan);
    }

    public static void main(String[] args) {
        boolean flag;
        for (int n = 501; n < 1000; n += 2) {// 偶数肯定不是素数,从3开始每次自增2就可以了
            flag = true;
            for (int i = 3; i <= n / 2; i++) {
                if (n % i == 0) {// 还有你这里i和n写反了
                    flag = false;
                    break;//这里的break只是结束了i的这个循环
                }
            }
            if (flag) {
                System.out.println("1000内的素数:" + n);
            }
        }
    }
}
