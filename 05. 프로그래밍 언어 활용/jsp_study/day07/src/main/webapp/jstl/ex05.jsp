<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*, models.Member" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="i" begin="1" end="10" step="2">
<%--step은 기본값 1이 들어가있기 때문에 작성안해도 된다.--%>
<%--step="2"는 2씩 증가하면서 숫자를 출력한다--%>
    <h1>${i}</h1>
</c:forEach>


<%
    List<Member> members = new ArrayList<>();
    for(int i = 1; i <= 10; i++){
        members.add(new Member("userId" + i, "123456","사용자" + i));
    }
    //EL식 변수가 들어가야 하기때문에
    pageContext.setAttribute("members", members);
%>

<table border='1'>
    <thead>
        <tr>
            <th>순번</th>
            <th>아이디</th>
            <th>비밀번호</th>
            <th>회원명</th>
        </tr>
    </thead>
    <tbody>
        <%--EL식 변수가 들어간다. items에 있는 members가 var의 member로 들어간다.--%>
        <c:forEach var="member" items="${members}" varStatus="status">
            <%--member == status.current와 동일한 참조값을 가지고 있다.--%>
            <%--제일 많이 사용하는 index(0부터), count(1부터)--%>
            <tr>
                <td>${status.count}</td>
                <td>${status.current.userId}</td>
                <td>${member.userPw}</td>
                <td>${member.userNm}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>



