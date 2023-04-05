package controllers.models;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/memberView/login")
public class LoginController extends HttpServlet {
    //로그인 양식
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { //get
        RequestDispatcher loginRD = req.getRequestDispatcher("/memberView/login.jsp");
        loginRD.forward(req, resp);
    }

    //로그인 처리
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { //post

    }
}
