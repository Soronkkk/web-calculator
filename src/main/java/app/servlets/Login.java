package app.servlets;

import app.DAO.DAOImplementation;
import app.entities.UsersEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class Login extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/login.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<UsersEntity> list = DAOImplementation.getAll();
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");
        for (UsersEntity user : list) {
            if (user.getUserName().equals(uname) && user.getPassword().equals(pass)) {
                HttpSession session = req.getSession();
                session.setAttribute("user", user);
                req.getRequestDispatcher("index.jsp").forward(req, resp);
            }
        }
        req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
    }
}
