<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags" %>
<c:set var="num" value="100" />
<util:box>
    <h1>안녕하세요.</h1>
    ${num}<br>
    <c:forEach var="i" begin="1" end="10" >
        ${i}<br>
    </c:forEach>
</util:box>

<%--
    자바코드는 박스안에 들어가지 않는다. 다만 자바코드 외에는 가능하다.
--%>