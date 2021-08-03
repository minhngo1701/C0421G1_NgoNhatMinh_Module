package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductDiscountCalculatorServlet", urlPatterns = "/display_discount")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float listPriceServlet = Float.parseFloat(request.getParameter("listPrice"));
        float discountPer = Float.parseFloat(request.getParameter("discountPercent"));

        double discountAmount = listPriceServlet * discountPer * 0.01;
        double discountPrice = listPriceServlet - discountAmount;


        request.setAttribute("discountAmountServlet", discountAmount);
        request.setAttribute("discountPriceServlet", discountPrice);
        request.getRequestDispatcher("display.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
