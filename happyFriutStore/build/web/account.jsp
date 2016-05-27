<%-- 
    Document   : accountjsp
    Created on : 2016-5-27, 18:41:55
    Author     : gandanyang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>结算页</title>
    </head>
    <body>
        <% int num1,num2,num3;
        String snuma=request.getParameter("numa");
        String snumb=request.getParameter("numb");
        String snumc=request.getParameter("numc");
        num1=Integer.valueOf(snuma);
        num2=Integer.valueOf(snumb);
        num3=Integer.valueOf(snumc);%>
        <p>&nbsp芒果每斤7元。已购买<b><%=num1%></b>斤&nbsp&nbsp总计<b><%=num1*7%></b>元</p>
        <p>&nbsp橙子每斤6元。已购买<b><%=num2%></b>斤&nbsp&nbsp总计<b><%=num2*6%></b>元</p>
        <p>哈密瓜每斤9元。已购买<b><%=num3%></b>斤&nbsp&nbsp总计<b><%=num3*9%></b>元</p>
    </body>
</html>
