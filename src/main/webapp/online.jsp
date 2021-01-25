<%@ page import="com.edu.pojo.User" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/25
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user=null;
    if (session.getAttribute("user")==null){
        response.sendRedirect("login.jsp");
    }else {
        user=(User)session.getAttribute("user");

    }

%>
    欢迎你：<%=user.getUsername()  %><br>
    <%Object userCount=session.getServletContext().getAttribute("userCount") ; %><br>
    目前在线人数：<%=userCount.toString()  %><br>
    <a href="loginOUt.jsp">离开</a>
<%

%>
</body>
</html>
