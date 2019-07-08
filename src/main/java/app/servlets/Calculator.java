package app.servlets;


import app.DAO.DAOImplementation;
import app.entities.ResultsEntity;
import app.entities.UsersEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

public class Calculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/calculator.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DAOImplementation daoImple = new DAOImplementation();
        ResultsEntity resultsEntity = new ResultsEntity();
        resultsEntity.setOperation(req.getParameter("operation"));
        resultsEntity.setResult(req.getParameter("result"));
        UsersEntity usersEntity = (UsersEntity) req.getSession().getAttribute("user");
        resultsEntity.setCookie(usersEntity.getCookie());
        daoImple.save(resultsEntity);
        req.getRequestDispatcher("/views/calculator.jsp").forward(req, resp);
    }
}
