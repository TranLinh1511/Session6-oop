package baiTap.bai2;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


    public void solve() {
        double deltal = Math.pow(this.b, 2) - 4 * a * c;
        if (a != 0) {
            if (deltal < 0) {
                System.out.println("Phương trình vô nghiệm!!");
            } else if (deltal >= 0) {
                System.out.println("Phương trình có nghiệm x1 = x2 = " + -b / (2 * a));
            } else {
                System.out.println("Phương trình có nghiệm x1 = " + getRoot1());
                System.out.println("Phương trình có nghiệm x2 = " + getRoot2());
            }
        } else {
            // bx + c = 0
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm!!");
                } else {
                    System.out.println("Phương trình vô nghiệm!!");
                }
            } else {
                System.out.println("Phương trình có nghiệm là: " + (-b / c));
            }
        }
    }

    public double getRoot1() {
        return (-b + Math.sqrt(Math.pow(this.b, 2) - 4 * a * c)) / 2;
    }

    public double getRoot2() {
        return (-b - Math.sqrt(Math.pow(this.b, 2) - 4 * a * c)) / 2;
    }
}
