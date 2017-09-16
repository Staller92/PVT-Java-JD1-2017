<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html>
<html lang="ru">
<head>
    <title>Login page</title>
    <meta charset="utf-8"/>
</head>
<body>
<form action="servlet" method="post">
    <h4>Name:</h4>
    <input name="name" type="text"><br>
    <h4>Mobile phone:</h4>
    <input name="telefonNumber" type="text"><br>
    <h4> Email: </h4>
    <input name="email" type="email"><br>
    <input type="submit"><br>

</form>
<a href="<%= request.getRequestURI() %>"><h3>Try Again</h3></a>
</body>
</html>