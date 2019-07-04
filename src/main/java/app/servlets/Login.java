package app.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Login extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/login.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");
        if (uname.equals("user") && pass.equals("pass")) {
            HttpSession session = req.getSession();
            session.setAttribute("uname", uname);
            System.out.println("logined");
            req.getRequestDispatcher("index.html").forward(req, resp);

        } else {
            req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
        }
    }
}
