<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
    String[] names = {"이름1", "이름2", "이름3"};
    pageContext.setAttribute("names", names);
%>

${fn:toUpperCase("abc")}<br>

<c:forEach var="item" items="${fn:split('apple, orange, banana', ',')}">
    ${item}<br>
</c:forEach>

${fn:join(names, ",")}