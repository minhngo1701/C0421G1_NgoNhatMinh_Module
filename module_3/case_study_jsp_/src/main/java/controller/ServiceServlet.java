package controller;

import model.bean.service_model.Service;
import model.service.service_ser.IService;
import model.service.service_ser.ServiceImpl;

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
