<%@ page contentType="text/html; charset=utf-8" %>

<h1>회원가입 페이지</h1>
    <form method="post" action="">
        <dl>
            <dt>아이디</dt>
            <dd>
                <input type="text" name="userId" >
            </dd>
        </dl>
        <dl>
             <dt>비밀번호</dt>
             <dd>
                 <input type="password" name="userPw" >
             </dd>
        </dl>
        <dl>
            <dt>비밀번호 재확인</dt>
            <dd>
                <input type="password" name="userPwRe" >
            </dd>
        </dl>
        <dl>
            <dt>회원명</dt>
            <dd>
                <input type="text" name="userNm" >
            </dd>
        </dl>
        <button type="submit">가입하기</button>
    </form>