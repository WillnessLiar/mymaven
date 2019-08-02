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

<div class="container-fluid">
    <div class=" text-center ld" id="ld">
        <div class="main_left" id="main_left"><!--main_left开始-->
            <h3 class="p1">MENU</h3>

            <ul class="list-unstyled ">
                <a class="a_daohang" id="a_home" target="rightFrame" href="<%=basePath%>User/listUser"><li class=" li_a">rewer</li></a>

                <a class="a_daohang" id="a_customer" href="/CustomerController/showAllCus?pagesNo=1" target="rightFrame"><li class=" li_a">7887</li></a>

                <a class="a_daohang" id="a_comment" href="/CommentController/goComment.html?pagesNo=1" target="rightFrame"><li class=" li_a">666</li></a>

                <a class="a_daohang" id="a_book"  href="showAllBook.action?pagesNo=1" target="rightFrame"><li class=" li_a">545</li></a>
            </ul>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12 rd" id="rd">
            <div class=" main_right_top">
                <img src="<%=basePath%>static/images/6.png" class="img_color n" id="n" onclick="dianji()">
                <a style="float: right;margin-top: 3vh;margin-right: 1vw;color:#00ff00" href="Out.action" >退出</a>
                <p style="color:white;float:right;margin-top: 3vh;padding-right: 2vw">管理员:</p>

            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12" id="main_right_bottom">
            <iframe name="rightFrame" id="rightFrame" marginwidth="0"
                    marginheight="0" border="0" width="100%" height="600px;"
                    frameborder="0" style="background-color: #ffffff" src="">
            </iframe>
        </div>
    </div>
</div>






</body>
</html>
