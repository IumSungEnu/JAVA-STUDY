<%@ tag body-content="scriptless" pageEncoding="UTF-8" %>
<%@ tag trimDirectiveWhitespaces="true" %>
<%@ attribute name="header" fragment="true" %>
<%@ attribute name="footer" fragment="true" %>

<!DOCTYPE html>
<html>
    <head></head>
    <body>
        <header>
            <%--<h1>사이트 상단 공통 영역</h1>--%>
            <jsp:invoke fragment="header" />
        </header>
        <main>
            <jsp:doBody />
        </main>
            <footer>
                <%--<h1>사이트 하단 공통 영역</h1>--%>
                <jsp:invoke fragment="footer" />
            </footer>
    </body>
</html>