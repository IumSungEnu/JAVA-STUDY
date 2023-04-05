<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%
    Date date= new Date();
%>
<c:set var="date" value="<%=date%>" />
<fmt:timeZone value="America/New_York" >
    뉴욕 : <fmt:formatDate value="${date}" type="both" />
</fmt:timeZone>
<br>
<fmt:setTimeZone value="Asia/Sydney" />
    시드니 : <fmt:formatDate value="${date}" type="both" />

