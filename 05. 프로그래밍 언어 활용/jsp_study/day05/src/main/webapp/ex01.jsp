<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*, java.util.stream.*" %>
<%-- page import="java.util.stream.*"를 아래에 추가해도 상관없다 --%>

<%
    List<String> names = Arrays.asList("이름1", "이름2", "이름3");
    Stream<String> stm = names.stream();
%>