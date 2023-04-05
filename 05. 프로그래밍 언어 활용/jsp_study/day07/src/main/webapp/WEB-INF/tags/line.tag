<%@ tag body-content="empty" pageEncoding="UTF-8" %>
<%@ tag trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="size" type="java.lang.Integer" required="true"%>
<%@ attribute name="color" required="true"%> <%--required : 필수항목 --%>
<%-- attribute의 2가지 기능 : 자바변수,EL식 변수 --%>
자바 변수 : <%=size%><br>
EL식 속성 : ${size}<br>
----------------------------------------------<br>
속성(자바코드를 이용한 경우)
<div>
<% for(int i=0; i < size; i++){ %>
-
<% } %>
</div>

<div>
<% for(int i=0; i < size; i++){
    out.print("-");
} %>
</div>

<br>
EL식 코드를 이용한 경우
<div>
<c:forEach begin="1" end="${size}">
-
</c:forEach>
</div>

<br>
EL식 코드(color)
<div style="color : ${color}"}>
    <c:forEach begin="1" end="${size}">
        -
    </c:forEach>
</div>