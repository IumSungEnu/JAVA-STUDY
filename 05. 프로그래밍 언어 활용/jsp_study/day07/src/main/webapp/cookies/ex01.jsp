<%@ page contentType="text/html; charset=utf-8" %>

<%
    Cookie cookie = new Cookie("key1", "value1");
    cookie.setPath(request.getContextPath());
    cookie.setMaxAge(60 * 60 * 24 * 365);  //setMaxAge(초 * 분 * 1일 시간 * 1년 일) = 1년
    //cookie.setMaxAge(0);  //브라우저가 지난 쿠키를 삭제한다.(시간이 지난 쿠키는 삭제)
    response.addCookie(cookie);  //응답헤더의 set-Cookie : key1=value1; ...
%>

<%--
개인정보 조회를 하기 위해 쿠키가 필요하다.
그런데 쿠키는 보안이 매우 취약하다. 그래서 암호화를 꼭 설정해줘야 한다.
이러한 문제를 해결하기 위해 세션을 이용한다.
--%>