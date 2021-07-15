package _final_exam.service.impl;

import _final_exam.lib.Check;
import _final_exam.lib.CheckRegex;
import _final_exam.models.ProductIn;
import _final_exam.models.ProductOut;
import _final_exam.service.ProductOutService;
import _final_exam.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ProductOutServiceImpl extends Check implements ProductOutService {
    private static final String FILE_PATH = "src\\_final_exam\\data\\ProductOut.csv";
    private static ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    private List<ProductOut> products = new ArrayList<>();
    private static ProductOut productOut = new ProductOut();
    private static CheckRegex regex = new CheckRegex();
    @Override
    public void addProduct() {
        products = (List<ProductOut>) readAndWriteFile.readFileProduct(FILE_PATH);
        int id = 0;
        if (products == null) {
            products = new ArrayList<>();
            id = 1;
            productOut.setId(id);
        } else {
            productOut.setId(products.get(products.size() - 1).getId() + 1);
        }
        System.out.println("Nhập mã sản phẩm:");
        productOut.setIdProduct(regex.regexNameTest());
        System.out.println("Nhập tên sản phẩm:");
        productOut.setNameProduct(regex.regexNameTest());
        System.out.println("Nhập giá bán sản phẩm:");
        productOut.setCost(choiceDouble());
        System.out.println("Nhập số lượng sản phẩm:");
        productOut.setAmountProduct(choiceNumber());
        System.out.println("Nhập nhà sản xuất:");
        productOut.setProductor(regex.regexNameTest());
        System.out.println("Nhập giá xuất khẩu:");
        productOut.setCostOut(choiceDouble());
        System.out.println("Nhập quốc gia nhập sản phẩm:");
        productOut.setCountry(regex.regexNameTest());
        products.add(productOut);
        readAndWriteFile.writeFileByByteStream(products,FILE_PATH);
    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void displayProduct() {
        products = (List<ProductOut>) readAndWriteFile.readFileProduct(FILE_PATH);
        if (products == null) {
            System.out.println("Danh sách trống");
        } else {
            for (ProductOut productOut : products) {
                System.out.println(productOut);
            }
        }
    }

    @Override
    public void searchProduct() {
        products = (List<ProductOut>) readAndWriteFile.readFileProduct(FILE_PATH);
        System.out.println("Nhập tên sản phẩm cẩn tìm:");
        String name = regex.regexNameTest();
        for (ProductOut productOut : products) {
            if (productOut.getNameProduct().equals(name)) {
                System.out.println(productOut);
            }
        }
    }

}
