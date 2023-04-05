<%--@ tag body-content="empty" pageEncoding="UTF-8" --%>
<%@ tag body-content="scriptless" pageEncoding="UTF-8" %>
<%@ tag trimDirectiveWhitespaces="true" %>
<%@ attribute name="var" required="true" rtexprvalue="false" %>
<%@ attribute name="num1" type="java.lang.Integer" required="true" rtexprvalue="false" %>
<%@ attribute name="num2" type="java.lang.Integer" required="true" rtexprvalue="false" %>
<%--@ variable name-given="max" variable-class="java.lang.Integer" scope="AT_END"--%>
<%--@ variable name-given="max" variable-class="java.lang.Integer" scope="NESTED"--%>
<%@ variable name-from-attribute="var" alias="max" variable-class="java.lang.Integer" scope="NESTED"%>
<%--attribute name의 변수는 숫자만 가능하다.--%>

<%
    int max= num1;
    if(max < num2) max = num2;
    jspContext.setAttribute("max", max);
%>
<jsp:doBody />