package filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class CommonFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //필터체인(갔다가 돌아오는 구조)
        //chain를 반드시 선언해줘야 한다.
        //필터를 통해 쿠키의 암호화를 쉽게 설정할 수 있다.
        //공통기능은 모두 생성자에 추가,

        //요청전 공통 기능

        chain.doFilter(new CommonRequestWrapper((HttpServletRequest) request), response);

        //응답 후 공통 기능
    }
}
