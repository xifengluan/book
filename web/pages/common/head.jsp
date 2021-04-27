<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/23
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<base href="http://localhost:8080/book/">--%>
<%
    String bathpath = request.getScheme()
    +"://"
    +request.getServerName()
    +":"
    +request.getServerPort()
    +request.getContextPath()
    +"/";
%>
<%--<%=bathpath%>--%>
<base href="<%=bathpath%>">
<link type="text/css" rel="stylesheet" href="static/css/style.css">
<script type="text/javascript" src="static/script/jquery-1.7.2.js"></script>
