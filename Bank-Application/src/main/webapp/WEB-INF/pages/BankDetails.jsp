<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank Details</title>
</head>
<body>
<h1 align="left">Data is received successfully.......</h1>
<h1>${ validateMessage}</h1>
<h3>${ Invalidate message}</h3>
<h2 align="left">Bank Details are shown below</h2>
<hr>
Bank Name:${ Name}<br>
Location:${Location }<br>
Contact Number:${ContactNumber }<br>
Branch:${Branch }<br>
Ifsc Code:${ IfscCode}<br>
</body>
</html>