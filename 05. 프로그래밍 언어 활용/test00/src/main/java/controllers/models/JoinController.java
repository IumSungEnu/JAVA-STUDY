package controllers.models;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/memberView/join")
public class JoinController extends HttpServlet {
    //회원가입 양식
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { //get
        RequestDispatcher joinRD = req.getRequestDispatcher("/memberView/join.jsp");
        joinRD.forward(req, resp);
    }

    //회원가입 처리
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { //post

    }
}
