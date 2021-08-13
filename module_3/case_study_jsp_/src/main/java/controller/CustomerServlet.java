package controller;

import model.bean.customer.Customer;
import model.service.customer.CustomerServiceImpl;
import model.service.customer.ICustomerService;
import model.service.type_of_customer.ITypeOfCustomerService;
import model.service.type_of_customer.TypeOfCustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerServiceImpl();
    private ITypeOfCustomerService iTypeOfCustomerService = new TypeOfCustomerServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request, response);
                break;
            case "update":
                editCustomer(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
            default:
                break;
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        this.iCustomerService.remove(id);
        showCustomerList(request,response);
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        int typeCustomerId = Integer.parseInt(request.getParameter("typeOfCustomerId"));
        String name = request.getParameter("name");
        String dateOfBirth = request.getParameter("dateOfBirth");
        Boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String cardId = request.getParameter("cardId");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String code = request.getParameter("code");

        Customer customer = new Customer(id,typeCustomerId,name,dateOfBirth,gender,cardId,phone,email,address,code);
        this.iCustomerService.update(customer);
        request.setAttribute("message", "Customer was updated");
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/update.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        int typeCustomerId = Integer.parseInt(request.getParameter("typeOfCustomerId"));
        String name = request.getParameter("name");
        String dateOfBirth = request.getParameter("dateOfBirth");
        Boolean gender = Boolean.parseBoolean(request.getParameter("genderCustomer"));
        String cardId = request.getParameter("cardId");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String code = request.getParameter("code");

        Customer customer = new Customer(typeCustomerId,name,dateOfBirth,gender,cardId,phone,email,address,code);
        this.iCustomerService.create(customer);
        request.setAttribute("message", "Customer was created");
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateCustomer(request, response);
                break;
            case "update":
                showEditCustomer(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
            default:
                showCustomerList(request,response);
                break;
        }
    }

    private void showEditCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.iCustomerService.findById(id);
        request.setAttribute("customer", customer);
        request.setAttribute("typeOfCustomer", this.iTypeOfCustomerService.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/update.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCustomerList(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customers = this.iCustomerService.findAll();
        request.setAttribute("customerList",customers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list_customer.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateCustomer(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("typeOfCustomer", this.iTypeOfCustomerService.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
