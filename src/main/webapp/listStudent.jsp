<%--
  Created by IntelliJ IDEA.
  User: ChunjieTang
  Date: 2018/2/8
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>学生信息</title>

    <!-- 引导外部bootstrap中的css文件 /bootstrap/css/bootstrap.css-->
    <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
    <!-- 引导jQuery文件 /bootstrap/js/jquery.min.js-->
    <script src="bootstrap/js/jquery.min.js" type="text/javascript"></script>
    <!-- 引导bootstrap.min.js文件 /bootstrap/js/bootstrap.min.js-->
    <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>
<table class="table table-striped" style="width: 500px;align-content: center">
    <thead>
    <tr>
        <th>姓名</th>
        <th>出生日期</th>
        <th>平均分</th>
        <th>备注</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${pageBean.datas}" var="stu">
        <tr>
            <td>${stu.name}</td>
            <td><fmt:formatDate pattern="yyyy-MM-dd" value="${stu.birthday}"/></td>
            <td>${stu.avgScore}</td>
            <td>${stu.description}</td>
            <td>
                <a href="${pageContext.request.contextPath}/edit?id=${stu.id}">修改</a>|
                <a href="${pageContext.request.contextPath}/del?id=${stu.id}">删除</a>
            </td>
        </tr>

    </c:forEach>
    </tbody>
</table>
<ul class="pagination">
    <%--下一页--%>
    <c:choose>
        <c:when test="${pageBean.pc > 1}">
            <li><a title="上一页" href="${pageContext.request.contextPath}/list?pageNo=${pageBean.pc-1}">&laquo;</a></li>
        </c:when>
        <c:otherwise>
            <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
        </c:otherwise>
    </c:choose>

    <c:choose>
        <%-- 第一条：如果总页数<=10，那么页码列表为1 ~ tp --%>
        <c:when test="${pageBean.tp <= 10 }">
            <c:set var="begin" value="1"/>
            <c:set var="end" value="${pageBean.tp }"/>
        </c:when>
        <c:otherwise>
            <%-- 第二条：按公式计算，让列表的头为当前页-4；列表的尾为当前页+5 --%>
            <c:set var="begin" value="${pageBean.pc-4 }"/>
            <c:set var="end" value="${pageBean.pc+5 }"/>

            <%-- 第三条：第二条只适合在中间，而两端会出问题。这里处理begin出界！ --%>
            <%-- 如果begin<1，那么让begin=1，相应end=10 --%>
            <c:if test="${begin<1 }">
                <c:set var="begin" value="1"/>
                <c:set var="end" value="10"/>
            </c:if>
            <%-- 第四条：处理end出界。如果end>tp，那么让end=tp，相应begin=tp-9 --%>
            <c:if test="${end>pageBean.tp }">
                <c:set var="begin" value="${pageBean.tp-9 }"/>
                <c:set var="end" value="${pageBean.tp }"/>
            </c:if>
        </c:otherwise>
    </c:choose>

    <%-- 循环显示页码列表 --%>
    <c:forEach begin="${begin}" end="${end}" var="i">
        <c:choose>
            <c:when test="${i eq pageBean.pc}">
                <li class="active"><span>${i}</span></li>
            </c:when>
            <c:otherwise>
                <li><a href="${pageContext.request.contextPath}/list?pageNo=${i}">${i}</a></li>
            </c:otherwise>
        </c:choose>
    </c:forEach>

    <%--下一页--%>
    <c:choose>
        <c:when test="${pageBean.pc < pageBean.tp}">
            <li><a title="下一页" href="${pageContext.request.contextPath}/list?pageNo=${pageBean.pc+1}">&raquo;</a></li>
        </c:when>
        <c:otherwise>
            <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">&raquo;</span></a></li>
        </c:otherwise>
    </c:choose>
</ul>
</body>
</html>
