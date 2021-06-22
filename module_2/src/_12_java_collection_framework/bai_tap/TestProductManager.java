package _12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class TestProductManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        while (true) {
            System.out.println("-------Product Manager-------");
            System.out.println("1. Add products");
            System.out.println("2. Edit products information");
            System.out.println("3. Delete products by id");
            System.out.println("4. Display products list");
            System.out.println("5. Search products by name");
            System.out.println("6. Sort products by cost ascending");
            System.out.println("7. Sort products by cost descending");
            System.out.println("8. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    productManager.addProduct(new Product());
                    break;
                case 2:
                    productManager.editProductById();
                    break;
                case 3:
                    productManager.removeProductById();
                    break;
                case 4:
                    productManager.showProduct();
                    break;
                case 5:
                    productManager.findProduct();
                    break;
                case 6:
                    productManager.ascending();
                    break;
                case 7:
                    productManager.descending();
                    break;
                case 8:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Please re-enter your choice: ");
            }
        }




    }
}
