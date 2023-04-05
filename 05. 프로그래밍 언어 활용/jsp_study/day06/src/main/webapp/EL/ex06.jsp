<%@ page contentType="text/html; charset=utf-8" %>
<%--값이 있으면 true, 없으면 false--%>
${empty param.num1}<br>
${param.num1 > 10 ? '10보다 크다' : '10보다 작다'}