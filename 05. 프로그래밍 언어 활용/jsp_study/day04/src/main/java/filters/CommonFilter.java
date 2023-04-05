package filters;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class CommonFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //초기화
        String param1 = filterConfig.getInitParameter("param1");
        String param2 = filterConfig.getInitParameter("param2");
        System.out.printf("param1=%s, param2=%s%n", param1, param2);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        //post 메서드 한정해서 charencoding utf-8
//        //이렇게는 잘 안쓰는 방법이다.
//        HttpServletRequest req = (HttpServletRequest)request;
//        String method = req.getMethod();
//        if(method.toUpperCase().equals("POST")){
//            req.setCharacterEncoding("UTF-8");
//        }

        ServletRequest requestWrapper = new CommonRequestWrapper((HttpServletRequest) request);

        chain.doFilter(requestWrapper, response);
    }
}
