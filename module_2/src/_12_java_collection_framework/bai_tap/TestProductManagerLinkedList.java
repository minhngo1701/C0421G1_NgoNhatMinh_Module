package _12_java_collection_framework.bai_tap;

import java.util.Scanner;

public class TestProductManagerLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManagerLinkedList productManagerLinked = new ProductManagerLinkedList();
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
                    productManagerLinked.addProduct1(new Product());
                    break;
                case 2:
                    productManagerLinked.editProductById1();
                    break;
                case 3:
                    productManagerLinked.removeProductById1();
                    break;
                case 4:
                    productManagerLinked.displayProduct1();
                    break;
                case 5:
                    productManagerLinked.findProduct1();
                    break;
                case 6:
                    productManagerLinked.ascending1();
                    break;
                case 7:
                    productManagerLinked.descending1();
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
