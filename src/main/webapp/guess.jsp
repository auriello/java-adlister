<%--
  Created by IntelliJ IDEA.
  User: princessauriel
  Date: 5/18/23
  Time: 8:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/guess" method="post">
  <label for="number">Guess a Number:</label>
  <input type="number" id="number" placeholder="Pick a number between 1 and 3" name="userNum">
  <button>Submit</button>
</body>
</html>
