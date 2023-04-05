<%@ page contentType="text/html; charset=utf-8" %>
<jsp:useBean id="list" class="java.util.ArrayList" />
<%
    list.add("abc");
    System.out.println(list);
%>