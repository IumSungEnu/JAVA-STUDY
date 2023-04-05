package controllers.members;

import commons.MessageUtil;
import models.member.JoinService;
import models.member.Member;
import models.member.ServiceManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/member/join")
public class JoinController extends HttpServlet {
    //회원가입 양식
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //GET 방식을 이용하여 연동
        RequestDispatcher rd = req.getRequestDispatcher("/member/join.jsp");
        rd.forward(req, resp);
    }

    //회원가입 처리
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //POST방식을 이용하여 연동(회원가입 페이지에서 작성했을때)

        try {
            ServiceManager manager = new ServiceManager();
            JoinService service = manager.getJoinService();

            Member member = new Member();
            member.setUserId(req.getParameter("userId"));
            member.setUserPw(req.getParameter("userPw"));
            member.setUserPwRe(req.getParameter("userPwRe"));
            member.setUserNm(req.getParameter("userNm"));

            service.join(member);

            //예외가 발생 X -> 회원가입 성공 -> 로그인 페이지 이동
            String url = req.getContextPath() + "/member/login";
            //resp.sendRedirect(url);
            //out.printf("<script>parent.location.replace('%s');</script>", url);
            MessageUtil.go(url, "parent", resp);

        }catch (RuntimeException e){
            //검증 실패, 회원가입 실패
            e.printStackTrace();
            MessageUtil.alertError(e, resp);
        }
    }
}
