package baiTap.bai1;

public class Circle {
    double r;
    String color;

    public Circle() {
    }

    public void inputData(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double perimeter() {
        return this.r * 2 * Math.PI;
    }

    public double acreage() {
        return Math.pow(this.r, 2) * Math.PI;
    }

    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", color='" + color + '\'' +
                '}';
    }
}
