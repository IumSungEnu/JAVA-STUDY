package filters;

import javax.servlet.*;
import java.io.IOException;

public class HelloFilter2 implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("Before Hello Filter2");

        chain.doFilter(request, response);

        System.out.println("After Hello Filter2");
    }
}
