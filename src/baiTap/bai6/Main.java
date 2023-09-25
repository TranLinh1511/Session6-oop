package baiTap.bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee em = new Employee();
        Employee[] employee = new Employee[20];
        employee[0] = new Employee(1, "Linh", 18, 12, true);
        employee[1] = new Employee(2, "Hiếu", 18, 12, true);
        employee[2] = new Employee(3, "Phan", 18, 12, true);
        employee[3] = new Employee(4, "Hùng", 18, 12, true);
        employee[4] = new Employee(5, "Thạch", 18, 12, true);
        employee[5] = new Employee(6, "Công", 18, 12, true);
        do {
            System.out.println("1. Thêm mới nhân viên\n" +
                    "2. Hiển thị danh sách nhân viên\n" +
                    "3. Thoát chương trình");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1: {
                    for (int i = 0; i < employee.length; i++) {
                        if (employee[i] == null) {
                            employee[i] = em.inputData();
                            System.out.println("Thêm mới nhân viên thành công");
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    for (int i = 0; i < employee.length; i++) {
                        if (employee[i] != null) {
                            System.out.println("Thông tin nhân viên " + (i + 1));
                            System.out.println(employee[i].displayDatas());
                        }
                    }
                    break;
                }
                default: {
                    System.out.println("Yêu cầu nhập đúng trường!!");
                    break;
                }
            }
        } while (true);
    }
}
