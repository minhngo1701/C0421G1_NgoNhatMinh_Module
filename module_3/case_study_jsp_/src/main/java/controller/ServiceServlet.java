package controller;

import model.bean.service_model.Service;
import model.service.service_ser.IService;
import model.service.service_ser.ServiceImpl;
import model.service.service_type.IRentTypeService;
import model.service.service_type.IServiceType;
import model.service.service_type.RentTypeService;
import model.service.service_type.ServiceTypeImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet", urlPatterns = "/service")
public class ServiceServlet extends HttpServlet {
    private IService iService = new ServiceImpl();
    private IServiceType iServiceType = new ServiceTypeImpl();
    private IRentTypeService iRentTypeService = new RentTypeService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createService(request, response);
                break;
            default:
                break;
        }
    }

    private void createService(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        double area = Double.parseDouble(request.getParameter("area"));
        int floor = Integer.parseInt(request.getParameter("floor"));
        int amountPeople = Integer.parseInt(request.getParameter("amountPeople"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        String standardRoom = request.getParameter("standardRoom");
        String description = request.getParameter("description");
        int serviceTypeId = Integer.parseInt(request.getParameter("typeId"));
        int rentTypeId = Integer.parseInt(request.getParameter("rentTypeId"));
        String status = request.getParameter("status");

        Service service = new Service(name, area, floor, amountPeople, cost, standardRoom, description, serviceTypeId, rentTypeId, status);
        this.iService.create(service);
        request.setAttribute("message", "Service was created");
        RequestDispatcher dispatcher = request.getRequestDispatcher("service_show/create.jsp");
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
                showCreateService(request, response);
                break;
            default:
                showServiceList(request,response);
                break;
        }
    }

    private void showCreateService(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("serviceTypeList", this.iServiceType.findAll());
        request.setAttribute("rentTypeList", this.iRentTypeService.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("service_show/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showServiceList(HttpServletRequest request, HttpServletResponse response) {
        List<Service> services = this.iService.findAll();
        request.setAttribute("serviceList", services);
        RequestDispatcher dispatcher = request.getRequestDispatcher("service_show/list_service.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
