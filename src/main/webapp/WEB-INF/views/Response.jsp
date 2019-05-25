<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="design2.css">
</head>
<body>
	<%
		String name = request.getParameter("firstname"); 
		out.print("Hello " + name); 
	
	%>
</body>
</html>