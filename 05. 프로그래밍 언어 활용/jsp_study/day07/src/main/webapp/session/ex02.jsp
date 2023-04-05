<%@ page contentType="text/html; charset=utf-8" %>

<%
    String value = (String)session.getAttribute("sessKey1");
    out.print("value=" + value + "<br>");
%>
${sessKey1}<br>
${sessionScope.sessKey1}

<%--sessionScope 특정 세션만 볼수 있도록 설정--%>