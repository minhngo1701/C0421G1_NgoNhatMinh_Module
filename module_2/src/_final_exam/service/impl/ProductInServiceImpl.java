package _final_exam.service.impl;

import _final_exam.controllers.MainMenu;
import _final_exam.lib.Check;
import _final_exam.lib.CheckRegex;
import _final_exam.models.Product;
import _final_exam.models.ProductIn;
import _final_exam.service.ProductInService;
import _final_exam.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ProductInServiceImpl extends Check implements ProductInService {
    private static final String FILE_PATH = "src\\_final_exam\\data\\ProductIn.csv";
    private static ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    private List<ProductIn> products = new ArrayList<>();
    private static ProductIn productIn = new ProductIn();
    private static CheckRegex regex = new CheckRegex();
    @Override
    public void addProduct() {
        products = (List<ProductIn>) readAndWriteFile.readFileProduct(FILE_PATH);
        int id = 0;
        if (products == null) {
            products = new ArrayList<>();
            id = 1;
            productIn.setId(id);
        } else {
            productIn.setId(products.get(products.size() - 1).getId() + 1);
        }
        System.out.println("Nhập mã sản phẩm:");
        productIn.setIdProduct(regex.regexNameTest());
        System.out.println("Nhập tên sản phẩm:");
        productIn.setNameProduct(regex.regexNameTest());
        System.out.println("Nhập giá bán sản phẩm:");
        productIn.setCost(choiceDouble());
        System.out.println("Nhập số lượng sản phẩm:");
        productIn.setAmountProduct(choiceNumber());
        System.out.println("Nhập nhà sản xuất:");
        productIn.setProductor(regex.regexNameTest());
        System.out.println("Nhập giá nhập khẩu:");
        productIn.setCostIn(choiceDouble());
        System.out.println("Nhập tỉnh thành nhập:");
        productIn.setProvince(regex.regexNameTest());
        System.out.println("Nhập thuế nhập khẩu:");
        productIn.setTax(choiceDouble());
        products.add(productIn);
        readAndWriteFile.writeFileByByteStream(products,FILE_PATH);
    }

    @Override
    public void deleteProduct() {
        products = (List<ProductIn>) readAndWriteFile.readFileProduct(FILE_PATH);
        System.out.println("Nhập mã sản phẩm:");
        String idProduct = regex.regexNameTest();
        for (ProductIn productIn : products) {
            if (idProduct.equals(productIn.getIdProduct())) {
                System.out.println("Yes");
                System.out.println("No");
                switch (regex.regexNameTest()) {
                    case "Yes":
                        products.remove(productIn);
                        readAndWriteFile.writeFileByByteStream(products,FILE_PATH);
                        searchProduct();
                        break;
                    case "No":
                        System.out.println("Quay về Menu chính");
                        new MainMenu().displayMainMenu();
                        break;
                }
            }
        }
    }

    @Override
    public void displayProduct() {
        products = (List<ProductIn>) readAndWriteFile.readFileProduct(FILE_PATH);
        if (products == null) {
            System.out.println("Danh sách trống");
        } else {
            for (ProductIn productIn : products) {
                System.out.println(productIn);
            }
        }
    }

    @Override
    public void searchProduct() {
        products = (List<ProductIn>) readAndWriteFile.readFileProduct(FILE_PATH);
        System.out.println("Nhập tên sản phẩm cẩn tìm:");
        String name = regex.regexNameTest();
        for (ProductIn productIn : products) {
            if (productIn.getNameProduct().equals(name)) {
                System.out.println(productIn);
            }
        }
    }
}
