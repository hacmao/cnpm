<%-- 
    Document   : addFail
    Created on : Dec 7, 2019, 9:32:28 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%
    String wrongCategory = (String) session.getAttribute("wrongCategory");
    String wrongProductId = (String) session.getAttribute("wrongProductId");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Fail</title>
    </head>
    
    
    <body>
        ${sql}
        <h1>Add Fail</h1>
        <c:if test="${wrongCategory == '1'}"> 
            <h2>Wrong Category!</h2>
        </c:if>
        <c:if test="${wrongProductId == '1'}">
            <h2>Wrong Product Id!</h2>
        </c:if>
            <a href="index.jsp">Home</a>
    </body>
</html>