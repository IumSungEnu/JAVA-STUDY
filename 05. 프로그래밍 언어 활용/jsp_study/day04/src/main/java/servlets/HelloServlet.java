package servlets;

import filters.CommonRequestWrapper;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        //init -> 가장 처음에 실행(초기화)
        String param1 = config.getInitParameter("param1");
        String param2 = config.getInitParameter("param2");
        //System.out.printf("param1 = %s, param2 = %s%n", param1, param2);
    }

    @Override
    public void destroy() {
        //destroy -> 가장 마지막에 실행
        System.out.println("Destroy");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("DoGet");
        System.out.println("/hello");

        //과거 방식
        //hello/path1
        String url = req.getRequestURI();
        String path = url.substring(url.lastIndexOf("/"));
        resp.setContentType("text/html; charset=UTF-8");

        if (path.contains("path1")) {
            doPath1(req, resp);
        } else if (path.contains("path2")){
            doPath2(req, resp);
        }else {

        //resp.setContentType("text/html"); -> ContentType이 작성되어야 브라우저가 잘 작동한다.
        //resp.setContentType("text/html");
        //resp.setCharacterEncoding("UTF-8");  //한글깨짐 방지

        PrintWriter out = resp.getWriter();
        out.println("<form method='post' action='hello'>");
        out.println("<input type='text' name='subject'>");
        out.println("<textarea name='content'></textarea>");
        out.println("<button type='submit'>작성</button>");
        out.println("</form>");
        }
    }
    private  void doPath1(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<h1>Path1</h1>");
    }
    private  void doPath2(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<h1>Path2</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.setCharacterEncoding("UTF-8"); //요청 데이터에 대한 인코딩을 알려주어야 제대로 해석해서 한글이 깨지지 않게 해준다.
        //req <--CommonRequestWrapper(실제 객체)
        String subject = req.getParameter("subject");
        String content = req.getParameter("content");
        System.out.printf("subject : %s%n", subject);
        System.out.printf("content : %s%n", content);
    }
}
