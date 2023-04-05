<%@ page contentType="text/html; charset=utf-8" %>
<%@ page isErrorPage="true" %>

<%-- 주석 --%>
<%-- isErrorPage : 에러페이지 설정을 한다.--%>

<h1>에러 발생</h1>
<h2><%=exception.getMessage()%></h2>
<%
    exception.printStackTrace();
%>