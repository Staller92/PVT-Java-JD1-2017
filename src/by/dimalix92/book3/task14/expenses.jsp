<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html>
<html lang="ru">
<head>
    <title>Add expenses</title>
    <meta charset="utf-8"/>
</head>
<body>
<form action="/test/database" method="post">
    <h4>Number:</h4>
    <input name="number" type="text">
    <h4>Pay Date:</h4>
    <input name="paydate" type="text">
    <h4> Receiver: </h4>
    <input name="receiver" type="text">
    <h4> Value: </h4>
    <input name="value" type="text">
    <input type="submit">

</form>
<a href="<%= request.getRequestURI() %>"><h3>Try Again</h3></a>
</body>
</html>