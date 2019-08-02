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
    <script type="text/javascript" src="<%=basePath%>static/js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="<%=basePath%>static/js/bootstrap.js"></script>
    <script type="text/javascript" src="<%=basePath%>static/js/index.js"></script>
    <link rel="stylesheet" href="<%=basePath%>static/css/bootstrap.css">
    <link rel="stylesheet" href="<%=basePath%>static/css/index.css">
</head>
<body>
                        <div class="row clearfix">
                            <div class="col-md-12 column">
                                <table align='center' border='1' width="50%">
                                    <tr>
                                        <td>id</td>
                                        <td>name</td>
                                        <td>password</td>
                                        <td>age</td>
                                    </tr>
                                    <c:forEach items="${list}" var="s" varStatus="st">
                                        <tr>
                                            <td>${s.id}</td>
                                            <td>${s.name}</td>
                                            <td>${s.password}</td>
                                            <td>${s.age}</td>
                                        </tr>
                                    </c:forEach>
                                </table>
                            </div>
                        </div>


</body>
</html>
