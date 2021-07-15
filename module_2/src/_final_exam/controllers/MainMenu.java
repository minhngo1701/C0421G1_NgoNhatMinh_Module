package _final_exam.controllers;

import _final_exam.lib.Check;
import _final_exam.service.impl.ProductInServiceImpl;
import _final_exam.service.impl.ProductOutServiceImpl;

import java.util.Scanner;

public class MainMenu extends Check {
    public void displayMainMenu() {
        while (true) {
            System.out.println("----Product Management----");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Xóa sản phẩm");
            System.out.println("3. Hiện thị sản phẩm");
            System.out.println("4.Tìm kiếm sản phẩm");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng:");
            switch (choiceNumber()) {
                case 1:
                    while (true) {
                        System.out.println("1. Thêm mới sản phẩm nhập khẩu");
                        System.out.println("2. Thêm mới sản phẩm xuất khẩu");
                        System.out.println("3. Quay về Menu chính");
                        switch (choiceNumber()) {
                            case 1:
                                new ProductInServiceImpl().addProduct();
                                break;
                            case 2:
                                new ProductOutServiceImpl().addProduct();
                                break;
                            case 3:
                                new MainMenu().displayMainMenu();
                                break;
                            default:
                                System.out.println("Mời bạn nhập lại:");
                        }
                    }
                case 2:
                    while (true) {
                        System.out.println("1. Xóa sản phẩm nhập khẩu");
                        System.out.println("2. Xóa sản phẩm xuất khẩu");
                        System.out.println("3. Quay về Menu chính");
                        switch (choiceNumber()) {
                            case 1:
                                new ProductInServiceImpl().deleteProduct();
                                break;
                            case 2:
                                new ProductOutServiceImpl().deleteProduct();
                                break;
                            case 3:
                                new MainMenu().displayMainMenu();
                                break;
                            default:
                                System.out.println("Mời bạn nhập lại:");
                        }
                    }
                case 3:
                    while (true) {
                        System.out.println("1. Hiển thị sản phẩm nhập khẩu");
                        System.out.println("2. Hiển thị sản phẩm xuất khẩu");
                        System.out.println("3. Quay về Menu chính");
                        switch (choiceNumber()) {
                            case 1:
                                new ProductInServiceImpl().displayProduct();
                                break;
                            case 2:
                                new ProductOutServiceImpl().displayProduct();
                                break;
                            case 3:
                                new MainMenu().displayMainMenu();
                                break;
                            default:
                                System.out.println("mời bạn nhập lại");
                        }
                    }
                case 4:
                    while (true) {
                        System.out.println("1. Tìm kiếm sản phẩm nhập khẩu");
                        System.out.println("2. Tìm kiếm sản phẩm xuất khẩu");
                        System.out.println("3. Quay về Menu chính");
                        switch (choiceNumber()) {
                            case 1:
                                new ProductInServiceImpl().searchProduct();
                                break;
                            case 2:
                                new ProductOutServiceImpl().searchProduct();
                                break;
                            case 3:
                                new MainMenu().displayMainMenu();
                                break;
                            default:
                                System.out.println("mời bạn nhập lại");
                        }
                    }

                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Nhập sai. Mời bạn nhập lại:");
            }
        }
    }

}
