<%@ tag body-content="empty" pageEncoding="UTF-8" %>
<%@ tag import="java.util.*" %>
<%@ tag trimDirectiveWhitespaces="true" %>
<%@ tag dynamic-attributes="attrs" %>

<%
    Map<String, String> _attrs = (Map<String, String>)jspContext.getAttribute("attrs");
    <%--
    out.print(_attrs.get("color"));
    out.print("<br>");
    out.print(_attrs.get("size"));
    --%>

    String color = _attrs.get("color");
    int size = Integer.parseInt(_attrs.get("size"));
    out.print("<div style='color':" + color +"'>");
    for(int i = 0; i < size; i++){
        out.print("-");
    }
    out.print("</div>");
%>

<%--
${attrs.color}<br>
${attrs.size}
--%>