<%--
  Created by IntelliJ IDEA.
  User: 21307
  Date: 2021/1/7
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    你是第<%= request.getServletContext().getAttribute("count") %>个访问的客户
</body>
</html>
