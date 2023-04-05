<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<layout:main>
    <h1>회원가입</h1>
    <form method="post" action="<c:url value='/member/join' />" target="ifrmProcess" autocomplete="off">
        <dl>
            <dt>아이디</dt>
            <dd>
                <input type="text" name="userId">
            </dd>
        </dl>
        <dl>
             <dt>비밀번호</dt>
             <dd>
                 <input type="password" name="userPw">
             </dd>
        </dl>
        <dl>
            <dt>비밀번호 확인</dt>
            <dd>
                <input type="password" name="userPwRe">
            </dd>
        </dl>
        <dl>
            <dt>회원명</dt>
            <dd>
                <input type="text" name="userNm">
            </dd>
        </dl>
        <div>
            <input type="checkbox" name="agree" value="1" id="agree">
            <label for="agree"> 약관 동의 합니다.</label>
        </div>
        <button type="submit">가입하기</button>
    </form>
</layout:main>
