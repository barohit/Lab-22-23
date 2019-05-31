<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="design.js"></script>
	<link rel="stylesheet" type="text/css" href="design2.css">
</head>
<body>
<table> 
	<tr> 
		<th> Name </th>
		<th> Description </th>
		<th> Quantity </th>
		<th> Price </th>
		<th> </th>
		<th> </th>
	</tr>
	<c:forEach var="p" items="${items}">
	<tr>
		<th> ${p.name} </th>
		<th> ${p.description} </th>
		<th> ${p.quantity} </th>
		<th> ${p.price} </th>
		<th> <a href="update?item=${p.itemID}"> Update </a>
		<th> <a href="delete?item=${p.itemID}" onclick="return confirmDelete()"> Delete </a>
	</tr>
	</c:forEach>


</table>
<br />
<br />
<a href="addnew">Add a new item</a>

</body>
</html>