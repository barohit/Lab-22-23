<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="design2.css">
</head>
<body>
	Your search turned up: 
	<table> 
		<tr> 
			<th> Name </th>
			<th> Description </th>
			<th> Price </th>
			<th> Quantity </th>
		</tr>
		<c:forEach var="p" items="${items}">
		<tr>
			<td> ${p.name}; </td>
			<td> ${p.description} </td>
			<td> ${p.price} </td>
			<td> ${p.quantity} </td>
		</tr>
		</c:forEach>
	
	</table>
</body>
</html>