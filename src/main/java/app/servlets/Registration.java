package app.servlets;

import app.DAO.DAOImplementation;
import app.entities.UsersEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Registration extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DAOImplementation daoImple = new DAOImplementation();
        if(req.getParameter("add")!=null){
            UsersEntity usersEntity = new UsersEntity();
            usersEntity.setUserName(req.getParameter("username"));
            usersEntity.setPassword(req.getParameter("password"));
            usersEntity.setFirstName(req.getParameter("name"));
            usersEntity.setSecondName(req.getParameter("surname"));
            daoImple.save(usersEntity);
            req.getRequestDispatcher("views/login.jsp").forward(req,resp);
        }
    }
}
