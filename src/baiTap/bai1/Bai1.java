package baiTap.bai1;

public class Bai1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.inputData(7,"yellow");
        System.out.println(circle.toString());
        System.out.println(circle.perimeter());
        System.out.println(circle.acreage());
    }
}
