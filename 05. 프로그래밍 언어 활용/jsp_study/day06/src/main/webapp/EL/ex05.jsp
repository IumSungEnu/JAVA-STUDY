<%@ page contentType="text/html; charset=utf-8" %>
<%
request.setCharacterEncoding("UTF-8");
%>
${paramValues.hobby[0]}<br>
${paramValues.hobby[1]}<br>
${paramValues.hobby[2]}<br>
${paramValues.hobby[3]}<br>

${header.Host}<br>
${header['Content-Type']}<br>
${cookie.JSESSIONID.value}<br>

request : ${pageContext.getRequest()}<br>
request : ${pageContext.request}<br>
