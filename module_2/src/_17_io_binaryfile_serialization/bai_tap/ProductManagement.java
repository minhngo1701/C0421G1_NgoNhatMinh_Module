package _17_io_binaryfile_serialization.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    private static List<Product> products = new ArrayList<>();
    private Product product = new Product();
    public void writeProductToAdd(String path, List<Product> products) throws IOException {
        FileOutputStream fos1 = null;
        ObjectOutputStream oos = null;

        try {
            fos1 = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos1);
            oos.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos1 != null) {
                fos1.close();
            }
            if (oos != null) {
                oos.close();
            }
        }
    }

    public static void readFileToDisplay(String path) throws IOException {

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (ois != null) {
                ois.close();
            }
        }

    }
    public void displayProduct()  {
        try {
            readFileToDisplay("src\\_17_io_binaryfile_serialization\\bai_tap\\Product.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }
    public void addToFile(String path) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id:");
        product.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter name:");
        product.setName(sc.nextLine());
        System.out.println("Enter manufacture:");
        product.setManufacture(sc.nextLine());
        System.out.println("Enter cost:");
        product.setCost(sc.nextDouble());
        products.add(product);
        try {
            writeProductToAdd(path, products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void findProductById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id to find");
        int id = Integer.parseInt(sc.nextLine());
        boolean check = false;
        if (products.isEmpty()) {
            System.out.println("No product to find");
        } else {
            for (Product product : products) {
                if (product.getId() == id) {
                    check = true;
                    System.out.println(product);
                }
            }
            if (check == false) {
                System.out.println("Can't find product");
            }
        }
    }
}
