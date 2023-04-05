<%@ tag body-content="scriptless" pageEncoding="UTF-8" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<layout:common>
    <jsp:attribute name="header">
        <h1>사이트 상단</h1>
    </jsp:attribute>

    <jsp:attribute name="footer">
        <h1>사이트 하단</h1>
    </jsp:attribute>

    <jsp:body>
        <jsp:doBody />
    </jsp:body>
</layout:common>