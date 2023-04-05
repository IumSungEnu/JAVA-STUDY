package filters;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.UnsupportedEncodingException;

public class CommonRequestWrapper extends HttpServletRequestWrapper {
    public CommonRequestWrapper(HttpServletRequest request) {
        super(request);  //매개변수가 있어야 한다.
        
        //상속 받아서 사용
        String method = request.getMethod();
        if(method.toUpperCase().equals("POST")){
            try {
                request.setCharacterEncoding("UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getParameter(String name) {
        String value = super.getParameter(name);

        value = value.toUpperCase();

        return value;
    }
}
//기본적으로 HttpServletRequestWrapper가 처리하고 CommonRequestWrapper 부분은 재정의한다.
//공통기능 + 추가기능
