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
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn từ 1 -> 5.");
            }
        }
    }

    public static void showStudent(ListStudent[] studentsr) {
        boolean check = false;
        for (int i = 0; i < studentsr.length; i++) {
            if (studentsr[i] != null) {
                System.out.println("Thông tin sinh viên thứ " + (i + 1) + " : ");
                System.out.println(studentsr[i].displayData());
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không có sinh viên.");
        }
    }

    public static void addStudent(ListStudent[] students) {
        ListStudent student = new ListStudent();
        System.out.println("Thêm số lượng sinh viên muốn thêm: ");
        int number = new Scanner(System.in).nextInt();
        int count = 0;
        for (int i = 0; i < students.length && count < number; i++) {
            if (students[i] == null) {
                System.out.println("Nhập sinh viên thứ " + (i + 1) + " : ");
                students[i] = student.inputData();
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Thêm mới thành công.");
        } else {
            System.err.println("Đã đầy học viên hoặc không có vị trí trống để thêm mới.");
        }
    }

    public static void updateStudent(ListStudent[] students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id muốn sửa: ");
        int id = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if ((students[i].getIdStudent()) == id) {
                System.out.println("Nhập tên học viên: ");
                String nameStudent = sc.next();
                System.out.println("Nhập tuổi học viên: ");
                int age = sc.nextInt();
                System.out.println("Nhập giới tính học viên: ");
                boolean sex = sc.nextBoolean();
                System.out.println("Nhập địa chỉ học viên: ");
                String address = sc.next();
                System.out.println("Nhập số điện thoại học viên: ");
                String phoneNumber = sc.next();
                ListStudent st = new ListStudent(id, nameStudent, age, sex, address, phoneNumber);
                students[i] = st;
                System.out.println("Sửa thành công.");
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy id.");
        }
    }

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
            System.out.println("Không tìm thấy id muốn xóa.");
        }
    }
}
