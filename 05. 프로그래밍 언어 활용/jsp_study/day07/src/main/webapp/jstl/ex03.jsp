<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="num1" value="300" />
<c:set var="num2" value="200" />

<c:if test="${num2 > num1}">
    <%-- 조건이 참일때 아래가 출력된다.--%>
    num2가 더 큽니다.
</c:if>
<c:if test="${num1 > num2}">
    <%-- num1의 value를 300으로 지정했을때 출력된다.--%>
    num1이 num2보다 크거나 같다.
</c:if>
<br>

<%--
    if문처럼 이렇게 길게 쓰는것을 별로 선호하지 않는다.
    간단한게 삼항연산자를 사용한다.
--%>

${num2 > num1 ? "num2가 더 큽니다." : "num1이 num2보다 크거나 같습니다."}

