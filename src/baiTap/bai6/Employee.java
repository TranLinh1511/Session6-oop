package baiTap.bai6;

import java.util.Scanner;

public class Employee {
    private int id, age;
    private long rate;
    private String name;
    private boolean sex;

    public Employee() {
    }


    public Employee(int id, String name, int age, long rate, boolean sex) {
        this.id = id;
        this.age = age;
        this.rate = rate;
        this.name = name;
        this.sex = sex;
    }

    public String displayDatas() {
        return
                "id=" + id +
                        ", name='" + name + '\'' +
                        ", age=" + age +
                        ", salary=" + calSalary(rate) +
                        ", rate=" + rate +
                        ", sex=" + sex;
    }

    public Employee inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id nhân viên: ");
        int id = sc.nextInt();
        System.out.println("Nhập tên nhân viên: ");
        String name = sc.next();
        System.out.println("Nhập tuổi nhân viên: ");
        int age = sc.nextInt();
        System.out.println("Nhập hệ số lương nhân viên: ");
        long rate = sc.nextInt();
        System.out.println("Nhập giới tính nhân viên: ");
        boolean sex = sc.nextBoolean();
        Employee e = new Employee(id, name, age, rate, sex);
        return e;
    }

    public long calSalary(long rate) {
        return rate * 1300000;
    }
}
