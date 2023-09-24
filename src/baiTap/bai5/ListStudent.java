package baiTap.bai5;

import java.util.Scanner;

public class ListStudent {

    private int idStudent;
    private String nameStudent;
    private int age;
    private boolean sex;
    private String address;
    private String phoneNumber;

    public ListStudent() {
    }

    public ListStudent(int idStudent, String nameStudent, int age, boolean sex, String address, String phoneNumber) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ListStudent inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã học viên: ");
        int idStudent = sc.nextInt();
        System.out.println("Nhập vào tên học viên: ");
        String nameStudent = sc.next();
        System.out.println("Nhập vào tuổi học viên: ");
        int age = sc.nextInt();
        System.out.println("Nhập vào giới tính học viên: ");
        boolean sex = sc.nextBoolean();
        System.out.println("Nhập vào địa chỉ học viên: ");
        String address = sc.next();
        System.out.println("Nhập vào số điện thoại học viên: ");
        String phoneNumber = sc.next();
        ListStudent s = new ListStudent(idStudent, nameStudent, age, sex, address, phoneNumber);
        return s;
    }

    public String displayData() {
        return "1. Mã sinh viên: " + idStudent + "\n" +
                "2. Tên sinh viên: " + nameStudent + "\n" +
                "3. Tuổi: " + age + "\n" +
                "4. Giới tính: " + (sex ? "Nam" : "Nữ") + "\n" +
                "5. Địa chỉ: " + address + "\n" +
                "6. Số điện thoại: " + phoneNumber;
    }
}
