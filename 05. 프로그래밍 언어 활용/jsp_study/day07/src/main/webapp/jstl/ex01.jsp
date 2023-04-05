<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="num1" value="100" scope="request"/>
<c:set var="num2" value="200" />
num1 : ${requestScope.num1}<br>
num2 : ${pageScope.num2}<br>
num1 + num2 = ${num1 + num2}<br>

<%--
    기본범위는 pageScope를 가지고 있다.
--%>