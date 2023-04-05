<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="ko_kr" />
<fmt:formatNumber value="10000000" type="currency" /><br>
<%--fmt:setLocale를 설정해서 쭉 내려간다. 새로운 fmt:setLocale을 만나기 전까지--%>

<fmt:setLocale value="en_us" />
<fmt:formatNumber value="10000000" type="currency" /><br>