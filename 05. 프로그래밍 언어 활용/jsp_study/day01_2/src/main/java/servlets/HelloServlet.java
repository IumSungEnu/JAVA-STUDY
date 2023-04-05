package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //view -> Active Editor -> soft Wrap를 설정하면 화면크기에 맞게 자동으로 지문이 짧아지거나 길어진다.
        //HttpServletRequest - 요청
        //HttpServletResponse - 응답

        PrintWriter out = resp.getWriter();
        out.println("Hello");

    }
}
