<%--
  Created by IntelliJ IDEA.
  User: HotDog
  Date: 2021/4/4
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath=request.getScheme()+"://"+request.getServerName()+":"+
        request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>查询学生</title>
    <base href="<%=basePath%>"/>
    <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
    <script type="text/javascript">
        $(function(){
            onloadStudent();
            $("#button").click(function(){
                onloadStudent();
            })
        })
        function onloadStudent(){
            $.ajax({
                url:"listStudent.do",
                type:"get",
                dataType:"json",
                success:function(resp){
                    $("#tb").html("");
                    $.each(resp,function (a,b){
                        $("#tb").append("<tr>")
                            .append("<td>"+b.name+"</td>")
                            .append("<td>"+b.id+"</td>")
                            .append("<td>"+b.age+"</td>")
                            .append("<td>"+b.password+"</td>")
                            .append("</tr>")
                    })
                }
            })
        }
    </script>
</head>
<body>
<div align="center">
    <table>
        <thead>
        <tr>
            <td>姓名</td>
            <td>编号</td>
            <td>年龄</td>
            <td>密码</td>
        </tr>
        </thead>
        <tbody id="tb"></tbody>
    </table>
    <input type="button" id="button" value="浏览"/>
</div>
</body>
</html>
