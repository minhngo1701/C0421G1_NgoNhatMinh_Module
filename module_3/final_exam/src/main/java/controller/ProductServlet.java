package controller;

import model.bean.Product;
import model.service.CategoryServiceImpl;
import model.service.ICategoryService;
import model.service.IProductService;
import model.service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    private IProductService iProductService = new ProductServiceImpl();
    private ICategoryService iCategoryService = new CategoryServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request,response);
                break;
            case "update":
                editProduct(request,response);
                break;
            case "delete":
                delete(request, response);
                break;
            default:
                break;
        }
    }
    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("nameProduct");
        Double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        String descript = request.getParameter("descript");
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));

        Product product = new Product( name, price, quantity, color, descript, categoryId);
        this.iProductService.create(product);
//        Map<String, String> stringMap = this.iProductService.create(product);
//        if (!stringMap.isEmpty()) {
//            request.setAttribute("map", stringMap);
//            request.setAttribute("customer", customer);
//            showCreateCustomer(request, response);
//        } else {
        request.setAttribute("message", "Product was created");
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void editProduct(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("nameProduct");
        Double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        String descript = request.getParameter("descript");
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));

        Product product = new Product(id, name, price, quantity, color, descript, categoryId);
        this.iProductService.update(product);
//        Map<String, String> stringMap = this.iProductService.update(product);
//        if (!stringMap.isEmpty()) {
//            request.setAttribute("map", stringMap);
//            request.setAttribute("customer", product);
//            showEditCustomer(request, response);
//        } else {
            request.setAttribute("message", "Product was updated");
            RequestDispatcher dispatcher = request.getRequestDispatcher("product/update.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        this.iProductService.remove(id);
        showProductList(request,response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateProduct(request, response);
                break;
            case "update":
                showEditProduct(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            default:
                showProductList(request,response);
                break;
        }
    }

    private void showCreateProduct(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("categoryList", this.iCategoryService.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showProductList(HttpServletRequest request, HttpServletResponse response) {
        List<Product> products = this.iProductService.findAll();
        request.setAttribute("productList",products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.iProductService.findById(id);
        request.setAttribute("product", product);
        request.setAttribute("categoryList", this.iCategoryService.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/update.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
