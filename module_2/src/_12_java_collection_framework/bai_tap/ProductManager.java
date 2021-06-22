package _12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProductManager  {
    private ArrayList<Product> products = new ArrayList<>(20);



   public void addProduct(Product p) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter name of product: ");
       p.setName(sc.nextLine());
       System.out.println("Enter id of product: ");
       p.setId(sc.nextInt());
       System.out.println("Enter cost of product: ");
       p.setCost(sc.nextInt());
       products.add(p);
   }

   public void removeProductById() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter id of product need to delete: ");
       int id = sc.nextInt();
       boolean check = false;
        if (products.isEmpty()) {
            System.out.println("No product to delete");
        } else {
            for (Product product : products) {
                if (product.getId() == id) {
                    check = true;
                    products.remove(product);
                }

            }
            if (check == false) {
                System.out.println("Can't find product need to delete");
            }

        }
   }

    @Override
    public String toString() {
        return "ProductManager{" +
                "products=" + products +
                '}';
    }

    public void showProduct() {
       if (products.size() == 0) {
           System.out.println("No producto show: ");
       } else {
           for (Product product : products) {
               System.out.println(product.toString());
           }
       }
    }

    public void editProductById() {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        if (products.isEmpty()) {
            System.out.println("No product to edit");
        } else {
            for (Product product : products) {
                if (product.getId() == id) {
                    System.out.println("Enter new name: ");
                    product.setName(sc.nextLine());
                    System.out.println("Enter new id:");
                    product.setId(sc.nextInt());
                    System.out.println("Enter new cost");
                    product.setCost(sc.nextInt());
                } else {
                    System.out.println("Can't find product need to edit");
                    break;
                }
            }
        }
    }
}
