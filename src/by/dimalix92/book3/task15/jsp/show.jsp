<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>
<%@page import="java.util.*" %>
<%@ page import="by.dimalix92.book3.task15.Expense" %>

<html lang="ru">
<head>
    <title>Show expences</title>
    <meta charset="utf-8"/>
</head>
<body>

<% ArrayList<Expense> expenses = (ArrayList<Expense>) session.getAttribute("Expenses");%>

<table border="1" align="center" width="600" bgcolor="#BEF574">
    <tr align="center">
        <td> Num</td>
        <td> Paydate</td>
        <td>Receiver</td>
        <td>Value</td>
    </tr>

    <%
        for (Expense expense : expenses) {
            out.println("<tr align=\"center\"><td>" +
                    expense.getNum() + "</td><td>" +
                    expense.getPaydate() + "</td><td>" +
                    expense.getReceiver() + "</td><td>" +
                    expense.getValue() + "</td></tr>");
        }
    %>

</table>
</body>
</html>