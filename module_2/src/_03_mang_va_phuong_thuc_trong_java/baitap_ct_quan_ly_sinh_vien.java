package _03_mang_va_phuong_thuc_trong_java;

import java.util.Scanner;

public class baitap_ct_quan_ly_sinh_vien {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("---------Chương trình quản lý sinh viên---------");
        String[] student = new String[50];
        while (true) {
            System.out.println("Menu chương trình:");
            System.out.println("1. Xem danh sách sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Thêm sinh viên");
            System.out.println("4. Chỉnh sửa thông tin sinh viên");
            System.out.println("5. Thoát chương trình");
            System.out.println("Chọn chức năng muốn sử dụng:");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    displayList(student);
                    break;
                case 2:
                    deleteStudent(student);
                    break;
                case 3:
                    addStudent(student);
                    break;
                case 4:
                    editStudent(student);
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Lựa chọn sai, mời bạn nhập lại:");
            }
        }
    }

    public static void displayList(String[] student) {
        for (String list : student) {
            if (list != null) {
                System.out.println(list);
            }
        }
    }

    public static void deleteStudent(String[] student) {
        String deleteStudent = input("Mời nhập tên sinh viên muốn xóa:");
        for (int i = 0; i < student.length; i++) {
            if (deleteStudent.equals(student[i])) {
                student[i] = null;
            }
        }
    }

    public static void addStudent(String[] student) {
        String addStudent = input("Mời nhập tên sinh viên mới:");
        for (int i = 0; i < student.length; i++) {
            if (student[i] == null) {
                student[i] = addStudent;
                break;
            }
        }
    }

    public static void editStudent(String[] student) {
        String choiceStudent = input("Mời nhập tên sinh viên muốn sửa:");
        String editStudent = input("Mời nhập tên sinh viên để sửa:");
        for (int i = 0; i < student.length; i++) {
            if (choiceStudent.equals(student[i])) {
                student[i] = editStudent;
            }
        }
    }

    public static String input(String message) {
        System.out.println(message);
        String nameInput = sc.nextLine();
        return nameInput;
    }
}
