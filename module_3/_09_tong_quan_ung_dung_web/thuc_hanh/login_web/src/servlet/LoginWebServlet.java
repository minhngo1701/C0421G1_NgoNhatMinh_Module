package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginWebServlet", urlPatterns = "/login")
public class LoginWebServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        request.setAttribute("usernameServlet", username);
        request.setAttribute("passwordServlet", password);

        if ("admin".equals(username) && "admin".equals(password)) {
            request.getRequestDispatcher("loginweb.jsp").forward(request,response);
        } else {
            request.getRequestDispatcher("errorlogin.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
