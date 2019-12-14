<%-- 
    Document   : logout
    Created on : Dec 11, 2019, 10:19:55 PM
    Author     : DELL
--%>

<%
    session.setAttribute("isLogin", "0");
    response.sendRedirect("index.jsp");
%>
