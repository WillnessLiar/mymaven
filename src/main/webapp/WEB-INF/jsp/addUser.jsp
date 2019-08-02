<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    %>
    <base href="<%=basePath%>">
    <title>uesr显示</title>
</head>
<body>
<form action="<%=basePath%>/User" method="post" enctype="multipart/form-data">
    ID:<input type="text" name="id"/><br/>
    姓名:<input type="text" name="name"/><br/>
    密码:<input type="text" name="password"/><br/>
    年龄:<input type="text" name="age"/><br/>
    <input type="submit" value="提交">


</form>





</body>
</html>