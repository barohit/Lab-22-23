<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="returntoadmin"> 
		Name <input type="text" name="name"> <br /> <br />
		Description <input type="text" name="description"> <br /> <br />
		Quantity <input type="text" name="quantity"> <br /> <br />
		Price <input type="text" name="price"> <br /> <br />
		<input type="hidden" value="${item}" name="itemID">
		<input type="submit" value="save">
	
	</form>
</body>
</html>