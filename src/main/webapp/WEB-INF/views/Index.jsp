<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Index</title>
	<link rel="stylesheet" type="text/css" href="design2.css">
	<script type="text/javascript" src="/design.js"></script>
	</head>
	<body>
		<h1> Welcome to the Coffee Shop! </h1>
		<p> Click the link below to create a new account </p>
		<a href="userRegistration"> Create New Account </a>
		<br />
		<br />
		<form action="search">
			Enter name here to search by name: <input type="search" name="searchname">
		</form>
		
		</form>
		<table> 
			<tr>
				<th> Name </th>
				<th> Description </th>
				<th> Price </th>
				<th> Quantity </th>
			</tr>
			<c:forEach var="i" items="${items}">
			<tr> 
				<td> ${i.name} </td>
				<td> ${i.description} </td>
				<td> ${i.price} </td>
				<td> ${i.quantity} </td>
			</tr>
			</c:forEach>
		</table>
		<c:forEach var="i" items="${hazelnutlatte}">
		<img src="${i.imglocation}">
		</c:forEach>
		<c:forEach var="i" items="${vanillalatte}">
		<img src="${i.imglocation}">
		</c:forEach>
	</body>

</html>