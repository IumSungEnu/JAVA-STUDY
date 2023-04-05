<%@ page contentType="text/html; charset=utf-8" %>
<h1>ex06.jsp 상단</h1>
<%
    RequestDispatcher rd = request.getRequestDispatcher("ex07.jsp");
    // rd.forward(request, response);
    rd.include(request, response);
%>
<h1>ex06.jsp 하단</h1>



