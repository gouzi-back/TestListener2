<%@ page import="com.edu.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/25
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
<%
    String userName =request.getParameter("userName");
    if (userName==null||userName.equals("")){
        response.sendRedirect("login.jsp");
    }else {
        //login  ok
        User user =new User();
        user.setUsername("username");
        session.setAttribute("user",user);
        response.sendRedirect("online.jsp");
    }
%>
</html>
