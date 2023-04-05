<%@ tag body-content="empty" pageEncoding="UTF-8" %>
<%@ tag trimDirectiveWhitespaces="true" %>
<%@ tag import="java.time.*, java.time.format.*" %>
<%@ attribute name="value" type="java.time.temporal.TemporalAccessor" required="true" %>
<%@ attribute name="pattern" %>

<%
    pattern = pattern == null ? "yyyy.MM.dd" : pattern;
    String date = DateTimeFormatter.ofPattern(pattern).format(value);
    out.print(date);
%>