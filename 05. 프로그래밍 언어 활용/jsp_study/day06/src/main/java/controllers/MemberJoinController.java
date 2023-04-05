package controllers;

import models.Member;
import models.MemberJoinService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/member/join")
public class MemberJoinController extends HttpServlet { //컨트롤(Controller)
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Request(요청)와 Response(응답) 사이 : 중재역활

        //모델(Model) - 기능  -> 요청
        MemberJoinService service = new MemberJoinService();
        service.process(req);

        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("123456");
        req.setAttribute("member", member);

        //View - 출력  -> 응답
        RequestDispatcher rd = req.getRequestDispatcher("/views/join.jsp");
        rd.forward(req, resp);
    }
}
