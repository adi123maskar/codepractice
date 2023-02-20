<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank Application</title>
</head>
<body>
<h1 align="center">Welcome to bank application</h1>
<hr>
<pre>
<form action="save.do" method="post">
Name:<input type="text" name="bankName"><br>
Location:<input type="text" name="location"><br>
ContactNumber:<input type="text" name="contactNumber"><br>
Branch:<input type="text" name="branch"><br>
Ifsc:<input type="text" name="ifscCode"><br>
<input type="submit" value="save">
</form>
</pre>
</body>
</html>