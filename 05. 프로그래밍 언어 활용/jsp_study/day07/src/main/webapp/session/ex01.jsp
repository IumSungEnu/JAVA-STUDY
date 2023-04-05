<%@ page contentType="text/html; charset=utf-8" %>

<%
    HttpSession session1 = request.getSession();
    HttpSession session1 = pageContext.getSession();

    //내장객체 session

    session.setAttribute("sessKey1", "sessValue1");
%>