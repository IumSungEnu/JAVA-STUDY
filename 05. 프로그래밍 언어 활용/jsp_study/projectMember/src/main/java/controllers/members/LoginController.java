package controllers.members;

import commons.MessageUtil;
import models.member.LoginService;
import models.member.ServiceManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static commons.MessageUtil.go;

@WebServlet("/member/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher rd = req.getRequestDispatcher("/member/login.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            ServiceManager manager = new ServiceManager();
            LoginService service = manager.getLoingService();

            service.login(req);

            //아이디 저장 있으면 쿠키 저장(1년간)
            String saveId = req.getParameter("saveId");
            String userId = req.getParameter("userId");
            Cookie cookie = new Cookie("saveId", userId);
            if(saveId != null){ //아이디 저장을 체크 한 경우
                cookie.setMaxAge(60*60*24*365);
            }else { //체크 안되어 있는 경우는 쿠키 삭제
                cookie.setMaxAge(0);
            }

            resp.addCookie(cookie);

            //로그인 성공 -> 메인 페이지로 이동
            String url = req.getContextPath();
            go(url, "parent", resp);

        }catch (RuntimeException e){
            e.printStackTrace();

            MessageUtil.alertError(e, resp); //실패시 -> 에러 출력
        }
    }
}
