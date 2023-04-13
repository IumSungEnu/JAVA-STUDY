package models.member;

import controllers.members.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Service
public class LoginService {
    @Autowired  //알아서 세션이 주입된다.
    private HttpSession session;

    @Autowired
    private MemberDAO memberDAO;

    @Autowired  //알아서 서블릿 객체가 주입된다.
    private HttpServletResponse response;

    public void login(Login login){
        //1.회원 데이터 조회
        Member member = memberDAO.get(login.getUserId());

        //2.세션에 로그인 유지
        session.setAttribute("member",member);

        //3. 아이디 저장 쿠기 저장 처리
        Cookie cookie = new Cookie("saveId", member.getUserId());
        if(login.isSaveId()){ //아이디 저장 체크시
            cookie.setMaxAge(60*60*24*365);  //1년 저장 - (초 * 분 * 시간 * 일)
        }else {  //아이디 저장 미 체크 시
            cookie.setMaxAge(0);  //삭제
        }
        response.addCookie(cookie);
    }
}
