<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>

<layout:common>
    <jsp:attribute name="header">
        <h1>헤더</h1>
    </jsp:attribute>
    <jsp:attribute name="footer">
             <h1>푸터</h1>
    </jsp:attribute>

    <jsp:body>
        <h1>본문 내용</h1>
    </jsp:body>

</layout:common>

<%--
    jsp:attribute는 위에 있어야 한다.
--%>
