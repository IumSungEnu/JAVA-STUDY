<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:formatNumber value="100000000" groupingUsed="false"/>
<br>
<fmt:formatNumber value="10.12" pattern="#.####" />
<br>
<fmt:formatNumber value="10.12" pattern="0.0000" />
<br>
<fmt:formatNumber value="10000000000" pattern="#,###" />
<%--,(콤마)를 넣은 경우 패턴 반복--%>
<br>
<fmt:formatNumber value="0.2" type="percent" />
<br>
<fmt:formatNumber value="10000" type="currency" />