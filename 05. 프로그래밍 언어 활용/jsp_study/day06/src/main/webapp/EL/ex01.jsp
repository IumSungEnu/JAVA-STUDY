<%@ page contentType="text/html; charset=utf-8" %>
<%
    pageContext.setAttribute("num1", 10);
    request.setAttribute("num2", 20);
%>
num1 : ${num1}<br>
num2 : ${num2}<br>
num1 + num2 : ${num1 + num2}<br>

<%--
속성을 관리하는 내장 객체, 연산도 가능하다.
-> 이 예제에 사용한 자바코드 방식은 권장사항이 아니다.
--%>