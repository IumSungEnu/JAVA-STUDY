<%@ page contentType="text/html; charset=utf-8" %>
<h1>ex05.jsp</h1>
<%
    String value1 = request.getParameter("key1");
    String value2 = request.getParameter("key2");

    out.println("value1 = " + value1 + "<br>");
    out.println("value2 = " + value2 + "<br>");
%>