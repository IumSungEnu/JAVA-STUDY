<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="ko" />

<fmt:bundle basename="messages.commons">
    <fmt:message key="userId" />
    <fmt:message key="loginStatus" >
        <fmt:param>사용자01</fmt:param>
        <fmt:param>userId</fmt:param>
    </fmt:message>
</fmt:bundle>
