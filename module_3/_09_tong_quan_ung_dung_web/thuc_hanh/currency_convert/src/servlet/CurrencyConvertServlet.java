package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CurrencyConvertServlet", urlPatterns = "/currency_convert")
public class CurrencyConvertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        float rate = Float.parseFloat(request.getParameter("rate"));
//        float usd = Float.parseFloat(request.getParameter("usd"));
//        float vnd = rate * usd;
//
//        request.setAttribute("rateCurrency", rate);
//        request.setAttribute("usdCurrency", usd);
//        request.setAttribute("vndCurrency", vnd);
//        request.getRequestDispatcher("convert.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));
        float vnd = rate * usd;

        request.setAttribute("rateCurrency", rate);
        request.setAttribute("usdCurrency", usd);
        request.setAttribute("vndCurrency", vnd);
        request.getRequestDispatcher("convert.jsp").forward(request, response);
    }
}
