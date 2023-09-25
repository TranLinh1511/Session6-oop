package baiTap.bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListStudent[] students = new ListStudent[100];
        while (true) {
            System.out.println("--------------------------------");
            System.out.println(
                    "1. Hiển thị danh sách tất cả học sinh\n" +
                            "2. Thêm mới học sinh\n" +
                            "3. Sửa thông tin học sinh dựa vào mã học sinh\n" +
                            "4. Xoá học sinh\n" +
                            "5. Thoát");
            System.out.println("--------------------------------");
            System.out.println("Nhập lựa chọn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    showStudent(students);
                    break;
                case 2:
                    addStudent(students);
                    break;
                case 3:
                    updateStudent(students);
                    break;
                case 4:
                    deleteStudent(students);
                    break;
                case 5:
                    System.out.println("Bạn đã thoát chương trình!!");
                    break;
                default:
                    System.out.println("Chọn từ 1 -> 5.");
            }
        }
    }

    // show
    public static void showStudent(ListStudent[] student) {
        boolean exist = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i] != null) {
                System.out.println("Sinh viên " + i);
                System.out.println(student[i].inputData());
                exist = true;
            }
            if (!exist) {
                System.out.println("Không có sinh viên trong danh sách!!");
            }
        }
    }

    // add
    public static void addStudent(ListStudent[] students) {
        ListStudent student = new ListStudent();
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i].inputData();
                System.out.println("Thêm mới sinh viên thành công!!");
            }
        }
    }

    // update
    public static void updateStudent(ListStudent[] students) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id sinh viên muốn sửa: ");
        int id = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getIdStudent() == id) {
                System.out.print("Nhập tên sinh viên: ");
                String name = sc.next();
                System.out.print("Nhập tuổi sinh viên: ");
                int age = sc.nextInt();
                System.out.print("Nhập giới tính sinh viên: ");
                Boolean sex = sc.nextBoolean();
                System.out.print("Nhập địa chỉ sinh viên: ");
                String address = sc.next();
                System.out.print("Nhập số điện thoại sinh viên: ");
                String tel = sc.next();
                ListStudent st = new ListStudent(id, name, age, sex, address, tel);
                students[i] = st;
                System.out.println("Thêm mới thành công!!");
                check = true;
            }
            if (!check) {
                System.out.println("Không có sinh viên trong danh sách");
            }
        }
    }

    // delete
    public static void deleteStudent(ListStudent[] students) {
        System.out.println("Nhập id muốn xóa: ");
        int id = new Scanner(System.in).nextInt();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (id == students[i].getIdStudent() && students[i] != null) {
                students[i] = null;
                System.out.println("Xóa thành công.");
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy id học sinh muốn xóa.");
        }
    }
}
