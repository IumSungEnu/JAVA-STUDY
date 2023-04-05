<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<layout:main>
    <h1>로그인</h1>
    <form method="post" action="<c:url value='/member/login' />" target="ifrmProcess" autocomplete="off">
        <dl>
            <dt>아이디</dt>
            <dd>
                <input type="text" name="userId" value="${cookie.saveId != null ? cookie.saveId.value : ''}">
            </dd>
        </dl>
        <dl>
            <dt>비밀번호</dt>
            <dd>
                <input type="password" name="userPw">
            </dd>
        </dl>
        <div>
            <input type="checkbox" name="saveId" value="1" id="saveId" ${cookie.saveId != null ? 'checked' : ''}>
            <label for="saveId">아이디 저장</label>
        </div>
        <button type="submit">로그인</button>
    </form>
</layout:main>