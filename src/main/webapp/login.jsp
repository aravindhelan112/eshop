<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "login.do" method = "post">
  <label for="fname">First name:</label><br>
  <input type="text" id="name" name="username"><br>
  <label for="lname">Password:</label><br>
  <input type="text" id="password" name="password">
  <input type = "submit" value ="submit">
</form>
</body>
</html>