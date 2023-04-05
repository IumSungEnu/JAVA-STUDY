<%@ page contentType="text/html; charset=utf-8" %>
<%
    pageContext.setAttribute("num1", 100);
    request.setAttribute("num1", 200);
    application.setAttribute("num1", 300);
%>
num1 : ${num1}<br>
pageScope.num1 : ${pageScope.num1}<br>
requestScope.num1 : ${requestScope.num1}<br>
applicationScope.num1 : ${applicationScope.num1}<br>

<%--
적용범위
pageContext < request < session < application

적용의 우선순위 -> 범위가 좁을수록 먼저 우선순위
pageContext > request > session > application

EL식을 쓰는이유 -> 간편하고 자바코드를 지양하기 때문에.
--%>