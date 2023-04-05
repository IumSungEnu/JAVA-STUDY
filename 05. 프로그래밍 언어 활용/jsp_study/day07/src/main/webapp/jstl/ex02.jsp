<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    pageContext.setAttribute("num1", 100);
    request.setAttribute("num1", 200);
    application.setAttribute("num1", 300);
%>
<c:remove var="num1" />
num1 : ${num1}<br>
pageScope : ${pageScope.num1}<br>
requestScope : ${requestScope.num1}<br>
application : ${applicationScope.num1}<br>


<%--
    속성값에서 제거한다.
    scope로 범위를 설정하면 특정 범위의 속성만 제거가 가능하다.
    범위를 지정하지 않으면 모든 정보가 제거되어 보이지 않게 된다.
--%>