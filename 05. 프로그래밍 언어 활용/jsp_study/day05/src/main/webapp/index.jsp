<%@ page contentType="text/html; charset=utf-8" %>
<%
    out.print("<h1>안녕하세요</h1>");

    String str = null;
    str.toUpperCase();
    <%-- str.toUpperCase(); - 보안쪽으로 문제, 500에러코드로 코드가 전부 노출이 된다.(해킹위협) --%>
%>
