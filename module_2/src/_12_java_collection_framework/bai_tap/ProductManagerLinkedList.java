package _12_java_collection_framework.bai_tap;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManagerLinkedList {
    private LinkedList<Product> productLinkedList = new LinkedList<>();

    public void addProduct1(Product p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of product: ");
        p.setName(sc.nextLine());
        System.out.println("Enter id of product: ");
        p.setId(sc.nextInt());
        System.out.println("Enter cost of product: ");
        p.setCost(sc.nextInt());
        productLinkedList.add(p);
    }

    public void removeProductById1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id of product need to delete: ");
        int id = sc.nextInt();
        boolean check = false;
        Product temp = new Product();
        if (productLinkedList.isEmpty()) {
            System.out.println("No product to delete");
        } else {
            for (Product product : productLinkedList) {
                if (product.getId() == id) {
                    temp = product;
                    check = true;
                }

            }
            if (check == false) {
                System.out.println("Can't find product need to delete");
            }
            productLinkedList.remove(temp);
        }
    }


    public void displayProduct1() {
        if (productLinkedList.size() == 0) {
            System.out.println("No product to show ");
        } else {
            for (Product product : productLinkedList) {
                System.out.println(product);
            }
        }
    }

    public void editProductById1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id want edit: ");
        int idEdit = Integer.parseInt(sc.nextLine());
        if (productLinkedList.isEmpty()) {
            System.out.println("No product to edit");
        } else {
            for (Product product : productLinkedList) {
                if (product.getId() == idEdit) {
                    System.out.println("Enter new id:");
                    product.setId(Integer.parseInt(sc.nextLine()));
                    System.out.println("Enter new name: ");
                    product.setName(sc.nextLine());
                    System.out.println("Enter new cost");
                    product.setCost(sc.nextInt());

                } else {
                    System.out.println("Can't find product need to edit");
                    break;
                }
            }
        }
    }

    public void findProduct1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product want to find: ");
        String p = sc.nextLine();
        if (productLinkedList.isEmpty()) {
            System.out.println("No product to find");
        } else {
            for (Product product : productLinkedList) {
                if (product.getName().equals(p)) {
                    System.out.println("Có sản phẩm " + product.getName());
                } else {
                    System.out.println("No find product");
                }
            }
        }
    }

    public void ascending1() {
        Collections.sort(productLinkedList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getCost() - o2.getCost();
            }
        });
        displayProduct1();
    }

    public void descending1() {
        Collections.sort(productLinkedList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getCost() - o1.getCost();
            }
        });
        displayProduct1();
    }
}
