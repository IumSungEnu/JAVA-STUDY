package org.koreait.models.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import java.io.IOException;
import java.util.ResourceBundle;

public class LoginFailureHandler implements AuthenticationFailureHandler {
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        //ResourceBundle - 꼭 기억해두자
        ResourceBundle bundle = ResourceBundle.getBundle("messages.validations");
        
        HttpSession session = request.getSession(); //세션 추가

        //String message = exception.getMessage();
        //System.out.println(message);
        String userId = request.getParameter("userId");
        String userPw = request.getParameter("userPw");

        try{
            if(userId == null || userId.isBlank()){  //아이디가 일치하지 않을때
                throw new LoginValidationException(bundle.getString("NotBlank.userId"), "userId");
            }
            if(userPw == null || userPw.isBlank()){  //비밀번호가 일치하지 않을때
                throw new LoginValidationException(bundle.getString("NotBlank.userPw"),"userPw");
            }
            
            //로그인 인증 실패시
            throw new LoginValidationException(bundle.getString("Validation.incorrect.login"), "global");

        }catch (LoginValidationException e){
            String field = e.getField();  //어떤 항목에서 검증 실패
            String message = e.getMessage();

            //세션에 해보자.(세션에 담는다)
            session.setAttribute("field", field);
            session.setAttribute("message", message);
        }
        
        //사용자한테 뭐가 있는지 알려줘야 한다.
        session.setAttribute("userId", userId);
        session.setAttribute("userPw", userPw);

        String url = request.getContextPath() + "/user/login";
        response.sendRedirect(url);
    }
}
