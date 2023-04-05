package filters;

import javax.servlet.*;
import java.io.IOException;

public class HelloFilter implements Filter {
    //doFilter : 체인
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        //요청 처리 전 공통 처리 코드
        System.out.println("Before Hello Filter1");

        chain.doFilter(request, response);
        //다음 적용되느 필터로 이동, 필터가 더이상 없으면 서블릿 객체의 요청 메서드를 실행한다.

        //응답 처리 후 공통 처리 코드
        System.out.println("Ater Hello Filter1");
    }
}
