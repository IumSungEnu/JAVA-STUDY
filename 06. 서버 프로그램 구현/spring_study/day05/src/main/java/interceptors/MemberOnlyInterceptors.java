package interceptors;

import models.member.Member;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MemberOnlyInterceptors implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("commonData", "공통 데이터");

        //request에서 getsession을 가져와야 한다.
        HttpSession session = request.getSession();

        //회원조회 -> 회원데이터
        //속성의 4가지 -> 페이지컨테스트, 리스펀스, 세션, 어뎁트
        Member member = (Member)session.getAttribute("member"); //형변환
        if(member != null){ //회원인 경우
            return true;
        }

        //비회원  /study - getContextPath()
        response.sendRedirect(request.getContextPath() + "/member/login");
        return false;
    }
}
