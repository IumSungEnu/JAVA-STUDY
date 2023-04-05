<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags" %>

<%--
<c:set var="num1" value="100" />
<c:set var="num2" value="200" />
<util:max num1="${num1}" num2="${num2}" />
 max.tag에서 rtexprvalue- false일 경우 EL식 변수를 허용하지 않는다.
--%>

<%--
<util:max num1="100" num2="200" />
${max}
--%>

<util:max var="maximum" num1="100" num2="200">
    <h1>큰수 : ${maximum}</h1>
</util:max>
<%--
    max.tag에 선언한 <%@ variable name-from-attribute="var" alias="max" variable-class="java.lang.Integer" scope="NESTED"%>에서 name-from-attribute="var"를 지정하면 max를 var로 넘겨준다. 그후 var에 변수를 선언하여 EL식으로 출력이 가능하다.
--%>