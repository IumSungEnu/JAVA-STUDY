<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.time.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags" %>

<%
    LocalDateTime date = LocalDateTime.now();
%>
<c:set var="date" value="<%=date%>" />
<util:formatDate value="${date}" pattern="yyyy.MM.dd HH:mm"/>