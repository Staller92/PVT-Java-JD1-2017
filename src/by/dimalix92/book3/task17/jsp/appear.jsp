<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<%@ page import="by.dimalix92.book3.task17.*" %>

<html lang="ru">
<head>
    <title>Show expences</title>
    <meta charset="utf-8"/>
</head>
<body>

<% ArrayList<Expense> expenses = (ArrayList<Expense>) session.getAttribute("Expenses");
    ArrayList<Receiver> reseivers = (ArrayList<Receiver>) session.getAttribute("Receivers");
    pageContext.setAttribute("arrayEx", expenses);
    pageContext.setAttribute("arrayRes", reseivers);
%>

<table border="1" align="center" width="600" bgcolor="#BEFF74" style="float:right;">
    <tr align="center">
        <td>Num</td>
        <td>Paydate</td>
        <td>Receiver</td>
        <td>Value</td>
    </tr>

    <c:forEach var="item" items="${arrayEx}">
        <tr align="center">
            <td>${item.num}</td>
            <td>${item.paydate}</td>
            <td>${item.receiver}</td>
            <td>${item.value}</td>
        </tr>
    </c:forEach>

</table>

<table border="1" align="center" width="600" bgcolor="#BEFF74" style="float:left;">
    <tr align="center">
        <td>Receiver</td>
        <td>Name</td>

    </tr>

    <c:forEach var="item" items="${arrayRes}">
        <tr align="center">
            <td>${item.num}</td>
            <td>${item.name}</td>
        </tr>
    </c:forEach>

</table>



</body>
</html>