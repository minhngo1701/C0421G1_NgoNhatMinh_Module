package _12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class TestProductManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        while (true) {
            System.out.println("-------Hệ thống quản lý sản phẩm-------");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm theo id");
            System.out.println("3. Xóa sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần");
            System.out.println("7. Sắp xếp sản phẩm giảm dần");
            System.out.println("8. Thoát");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    productManager.addProduct(new Product());
                    break;
                case 2:
                    productManager.editProductById();
                case 3:
                    productManager.removeProductById();
                    break;
                case 4:
                    productManager.showProduct();
                    break;
                case 8:
                    System.exit(1);
                    break;
            }
        }




    }
}
