<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="html" value="<h1>제목</h1>" />
<c:out value="${html}" escapeXml="false" />
<c:url var="ex04URL" value='/jstl/ex04.jsp' />

<%--
<a href="/day07/jstl/ex04.jsp">ex04 이동</a>  -> 앞에있는 day07은 바뀔수 있다.(페이지 오류발생)
그렇기 때문에 <c:url>로 day07라는 컨테스트 패스를 환경에 따라서 자동으로 바뀌게 하는 기능을 해준다.
--%>
<%--
<a href="<c:url value='/jstl/ex04.jsp' />">ex04 이동</a>
--%>
<a href="${ex04URL}">ex04 이동</a>