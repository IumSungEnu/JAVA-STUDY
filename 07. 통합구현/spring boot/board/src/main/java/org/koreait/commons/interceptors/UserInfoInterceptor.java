package org.koreait.commons.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.koreait.models.user.UserInfo;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class UserInfoInterceptor implements HandlerInterceptor {
    //공통기능, 요청직후, 응답후에...


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            Object principal = auth.getPrincipal();
            if (principal instanceof UserInfo) { // 로그인 한 경우
                UserInfo userInfo = (UserInfo) principal;
                userInfo.setUserPw(null);

                //세션을 넣고싶을때
                HttpSession session = request.getSession();
                session.setAttribute("userInfo", userInfo);
            }
        }
        return true; //주로 접근하는게 공통기능
    }
}
