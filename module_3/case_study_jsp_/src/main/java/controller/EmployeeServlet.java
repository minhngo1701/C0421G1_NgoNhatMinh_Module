package controller;

import model.bean.employee.Employee;
import model.service.emplyee.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    private IEmployeeService iEmployeeService = new EmployeeService();
    private IPositionService iPositionService = new PositionServiceImpl();
    private IEducationService iEducationService = new EducationServiceImpl();
    private IDivisionService iDivisionService = new DivisionServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createEmployee(request, response);
                break;
            case "update":
                editEmployee(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
            default:
                showEmployeeList(request,response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateEmployee(request, response);
                break;
            case "update":
                showEditEmployee(request,response);
                break;
            case "delete":
                delete(request, response);
                break;
            default:
                showEmployeeList(request,response);
                break;
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        this.iEmployeeService.remove(id);
        showEmployeeList(request, response);
    }

    private void showEmployeeList(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = this.iEmployeeService.findAll();
        request.setAttribute("employeeList", employeeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/list_employee.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateEmployee(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("positionList", this.iPositionService.findAll());
        request.setAttribute("educationList", this.iEducationService.findAll());
        request.setAttribute("divisionList", this.iDivisionService.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) {
        int positionId = Integer.parseInt(request.getParameter("positionId"));
        int educationId = Integer.parseInt(request.getParameter("educationId"));
        int divisionId = Integer.parseInt(request.getParameter("divisionId"));
        String name = request.getParameter("name");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String idCard = request.getParameter("idCard");
        Double salary = Double.parseDouble(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String userName = request.getParameter("userName");

        Employee employee = new Employee(name,dateOfBirth, idCard, salary, phone, email, address, positionId, educationId, divisionId, userName);
        this.iEmployeeService.create(employee);
        request.setAttribute("message", "Employee was created");
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/create.jsp");

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = this.iEmployeeService.findById(id);
        request.setAttribute("employee", employee);
        request.setAttribute("positionList", this.iPositionService.findAll());
        request.setAttribute("educationList", this.iEducationService.findAll());
        request.setAttribute("divisionList", this.iDivisionService.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/update.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        int positionId = Integer.parseInt(request.getParameter("positionId"));
        int educationId = Integer.parseInt(request.getParameter("educationId"));
        int divisionId = Integer.parseInt(request.getParameter("divisionId"));
        String name = request.getParameter("name");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String idCard = request.getParameter("idCard");
        Double salary = Double.parseDouble(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String userName = request.getParameter("userName");

        Employee employee = new Employee(id,name,dateOfBirth, idCard, salary, phone, email, address, positionId, educationId, divisionId, userName);
        this.iEmployeeService.update(employee);
        request.setAttribute("message", "Employee was updated");
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/update.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
