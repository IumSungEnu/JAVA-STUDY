package models.member;

import validators.Validator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.regex.Matcher;

public class LoginService {
    private MemberDAO memberDAO;
    private Validator validator;

    public LoginService(MemberDAO memberDAO, Validator validator){
        this.memberDAO = memberDAO;
        this.validator = validator;
    }

    public void login(HttpServletRequest request){

        //로그인 유효성 검사
        validator.check(request);

        //로그인 처리
        //회원데이터 가져오기
        String userId = request.getParameter("userId");
        Member member = memberDAO.get(userId);

        //세션에 저장
        HttpSession session = request.getSession();
        session.setAttribute("member", member);
    }
}
