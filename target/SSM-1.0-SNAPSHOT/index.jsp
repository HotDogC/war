<%--
  Created by IntelliJ IDEA.
  User: HotDog
  Date: 2021/4/4
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath=request.getScheme()+"://"+request.getServerName()+":"+
    request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>欢迎</title>
    <base href="<%=basePath%>"/>
</head>
<body>
<div align="center">
    <p>ssm整合</p>
    <img src="img/happy.jpg" width="500" height="500"/>
    <table>
        <tr>
            <td><a href="addStudent.jsp">注册学生</a></td>
        </tr>
        <tr>
            <td><a href="listStudent.jsp">浏览学生</a></td>
        </tr>
    </table>
</div>
</body>
</html>
