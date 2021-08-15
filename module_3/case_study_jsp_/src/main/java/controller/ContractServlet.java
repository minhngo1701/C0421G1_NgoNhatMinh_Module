package controller;

import model.bean.contract.Contract;
import model.bean.contract.DetailContract;
import model.repository.acttach_service.AttachServiceRepositoryImpl;
import model.repository.acttach_service.IAttachServiceRepository;
import model.repository.contract_repository.ContractRepositoryImpl;
import model.repository.contract_repository.IContractRepository;
import model.service.contract.*;
import model.service.customer.CustomerServiceImpl;
import model.service.customer.ICustomerService;
import model.service.emplyee.EmployeeService;
import model.service.emplyee.IEmployeeService;
import model.service.service_ser.IService;
import model.service.service_ser.ServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ContractServlet", urlPatterns = "/contract")
public class ContractServlet extends HttpServlet {
    private IContractService iContractService  = new ContractService();
    private IEmployeeService iEmployeeService = new EmployeeService();
    private IService iService = new ServiceImpl();
    private ICustomerService iCustomerService = new CustomerServiceImpl();
    private IAttachService iAttachService = new AttachServiceImpl();
    private IDetailContractService iDetailContractService = new DetailContractService();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                createContract(request,response);
                break;
            case "createContract":
                createDetail(request,response);
                break;
        }
    }

    private void createDetail(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int contractId = Integer.parseInt(request.getParameter("contractId"));
        int attachId = Integer.parseInt(request.getParameter("attachId"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        DetailContract detailContract = new DetailContract(contractId,attachId,quantity);

        this.iDetailContractService.createDetailContract(detailContract);
        request.setAttribute("message", "Contract detail was created");
        RequestDispatcher dispatcher = request.getRequestDispatcher("contract/create_detail_contract.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void createContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idEmployee = Integer.parseInt(request.getParameter("idEmployee"));
        int idCustomer = Integer.parseInt(request.getParameter("idCustomer"));
        int idService = Integer.parseInt(request.getParameter("idService"));
        String start = request.getParameter("start");
        String end = request.getParameter("end");
        double totalMoney = Double.parseDouble(request.getParameter("total"));
        double deposit = Double.parseDouble(request.getParameter("deposit"));

        Contract contract = new Contract(idEmployee,idCustomer,idService,start,end,totalMoney,deposit);
        this.iContractService.createContract(contract);
        request.setAttribute("message", "Contract was created");
        RequestDispatcher dispatcher = request.getRequestDispatcher("contract/create.jsp");
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
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                showCreate(request,response);
                break;
            case "createContract":
                showCreateDetailForm(request,response);
                break;
            default:
                showContract(request,response);
                break;
        }

    }

    private void showCreateDetailForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("contractList",this.iContractService.findAll());
        request.setAttribute("attachServiceList",this.iAttachService.findAll());
        request.getRequestDispatcher("contract/create_detail_contract.jsp").forward(request,response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("employeeList",this.iEmployeeService.findAll());
        request.setAttribute("customerList",this.iCustomerService.findAll());
        request.setAttribute("serviceList",this.iService.findAll());
        request.getRequestDispatcher("contract/create.jsp").forward(request,response);
    }


    private void showContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("contract/list_contract.jsp");
        try {
            dispatcher.forward(request, response);
        }  catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
