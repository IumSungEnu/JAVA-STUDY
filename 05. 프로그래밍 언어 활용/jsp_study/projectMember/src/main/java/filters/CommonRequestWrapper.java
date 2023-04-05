package filters;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.UnsupportedEncodingException;

public class CommonRequestWrapper extends HttpServletRequestWrapper {
    public CommonRequestWrapper(HttpServletRequest request) {
        super(request); //요청전 공동

        String method = request.getMethod().toUpperCase();  //인코딩 설정
        if(method.equals("POST")){
            try { //한글깨짐 방지
                request.setCharacterEncoding("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
