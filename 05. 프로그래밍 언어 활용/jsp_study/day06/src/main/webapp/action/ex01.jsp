<%@ page contentType="text/html; charset=utf-8" %>
<h1>Ex01.jsp</h1>
<jsp:forward page="ex02.jsp" />
<%--
    response.sendRedirect("ex02.jsp");
--%>

<%--
페이지를 이동하는게 아니라 버퍼로 인해 자료가 지워졌다가 다시 채워진다.
그래서 페이지를 이동한것과 같이 버퍼로 교체된다.
--%>
