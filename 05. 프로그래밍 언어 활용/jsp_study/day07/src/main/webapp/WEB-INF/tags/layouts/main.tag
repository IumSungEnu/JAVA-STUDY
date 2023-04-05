<%@ tag body-content="scriptless" pageEncoding="UTF-8" %>
<%@ tag trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>

<layout:common>
    <jsp:attribute name="header">
        <h1>메인페이지 상단 공통 영역</h1>
    </jsp:attribute>

    <jsp:attribute name="footer">
        <h1>메인페이지 하단 공통 영역</h1>
    </jsp:attribute>

    <jsp:body>
        <main>
           <jsp:doBody />
        </main>
    </jsp:body>
</layout:common>