<%@ page contentType="text/html; charset=utf-8" %>
<h1>ex04.jsp 상단</h1>

<jsp:include page="ex05.jsp">
    <jsp:param name="key1" value="value1" />
    <jsp:param name="key2" value="value2" />
</jsp:include>

<h1>ex04.jsp 하단</h1>