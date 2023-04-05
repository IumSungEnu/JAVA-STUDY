<%@ page contentType="text/html; charset=utf-8" %>
<%--한글 깨짐 방지--%>
<%
 request.setCharacterEncoding("UTF-8");
%>


<jsp:useBean id="member" class="models.Member" scope="request"/>
<jsp:setProperty name="member" property="*" />
<jsp:setProperty name="member" property="userId" param="memberId" />

<%--
<jsp:setProperty name="member" property="userId" />
<jsp:setProperty name="member" property="userPw" />
<jsp:setProperty name="member" property="userPwRe" />
<jsp:setProperty name="member" property="userNm" />
--%>

<jsp:getProperty name="member" property="userId" /><br>
<jsp:getProperty name="member" property="userPw" /><br>
<jsp:getProperty name="member" property="userPwRe" /><br>
<jsp:getProperty name="member" property="userNm" /><br>

<%--
    member.setUserId("user01");
    member.setUserPw("123456");
    member.setUserPwRe("123456");
    member.setUserNm("사용자01");
    System.out.println(member);
--%>
<%--
${pageScope.member.userId}<br>
${member.userPw}<br>
${member.userPwRe}<br>
${member.userNm}<br>
--%>

<%--
 속성범위가 scope="page"로 되있으면 member앞에 pageScope.가 기본값으로 들어가 있다.
 만약 속성범위를 scope="application"로 바꾸게 되면 ${pageScope.member.userId}는 범위에 속하지 못해 출력되지 않는다.
--%>
