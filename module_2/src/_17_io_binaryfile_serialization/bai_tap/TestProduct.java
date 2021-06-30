package _17_io_binaryfile_serialization.bai_tap;

import java.io.IOException;
import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Display product:");
            System.out.println("2. Add product:");
            System.out.println("3. Find product:");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    productManagement.displayProduct();
                    break;
                case 2:
                    productManagement.addToFile("src\\_17_io_binaryfile_serialization\\bai_tap\\Product.csv");
                    break;
                case 3:
                    productManagement.findProductById();
                    break;
                case 4:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Please re-enter:");
            }
        }
    }
}
