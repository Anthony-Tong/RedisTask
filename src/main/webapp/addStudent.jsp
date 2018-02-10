<%--
  Created by IntelliJ IDEA.
  User: ChunjieTang
  Date: 2018/2/8
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <!-- width=device-width:屏幕和设备屏幕一致，initial-scale=1:初始化缩放为100%，user-scalable:禁止用户缩放 -->
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no">

    <title>添加学生信息</title>

    <!-- 引导外部bootstrap中的css文件 /bootstrap/css/bootstrap.css-->
    <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
    <!-- 引导jQuery文件 /bootstrap/js/jquery.min.js-->
    <script src="bootstrap/js/jquery.min.js" type="text/javascript"></script>
    <!-- 引导bootstrap.min.js文件 /bootstrap/js/bootstrap.min.js-->
    <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <!--日期插件-->
    <script type="text/javascript" src="jedate/jquery.jedate.js"></script>
    <link type="text/css" rel="stylesheet" href="jedate/skin/jedate.css">
</head>
<body style="background: #f9fbfb">
<div class="container" style="background: #ffffff; width: 400px; height: 450px; margin-top: 50px;padding-top: 50px;">

    <c:choose>
        <c:when test=""></c:when>
    </c:choose>

    <form action="${pageContext.request.contextPath}/add" method="post" accept-charset="utf-8">
        <input type="hidden" name="id" value="${student.id}">
        <!-- 输入框组合 -->
        <div class="form-group">
            <div class="input-group">
                <label for="name" class="input-group-addon">姓名：</label>
                <input type="text" name="name" value="${student.name}" id="name" class="form-control">
            </div>
        </div>
        <div class="form-group">
            <div class="input-group">
                <label for="birthday" class="input-group-addon">生日：</label>
                <input type="text" name="birthday" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${stu.birthday}"/>" id="birthday" class="form-control">
            </div>
        </div>
        <div class="form-group">
            <div class="input-group">
                <label for="avgScore" class="input-group-addon">平均分：</label>
                <input type="text" name="avgScore" value="${student.avgScore}" id="avgScore" class="form-control">
            </div>
        </div>
        <div class="form-group">
            <label>备注：</label>
            <textarea name="description" class="form-control" rows="3">${student.description}</textarea>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-large btn-block btn-primary">添加学生信息</button>
        </div>

    </form>
</div>
</body>
</html>
<script type="text/javascript">
    $("#birthday").jeDate({
        isinitVal:true,
        festival:true,
        ishmsVal:false,
        minDate: '2016-06-16 23:59:59',
        maxDate: $.nowDate(0),
        format:"YYYY-MM-DD",
        zIndex:3000,
    })
</script>