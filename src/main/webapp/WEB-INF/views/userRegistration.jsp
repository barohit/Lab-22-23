<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title> Coffee Shop Registration Page</title>
	<script type="text/javascript" src="design.js"> </script>
	<link rel="stylesheet" type="text/css" href="design2.css">
</head>
<body>
	<h2> Please fill the form to register! </h2>
	<br />
	<form method="post" action="resp" onsubmit="return validate()"> 
		<fieldset id="identificationinfo">
			First Name <input type="text" name="firstname"> <br /><br />
			Last Name <input type="text" name="lastname"> <br /><br />
			Email <input type="text" name="email"> <br /><br />
			Phone Number <input type="text" name="phoneNumber"> <br /><br />
		</fieldset>
		<fieldset id="password">
			Password <input type="text" name="password" id="pass1"> <br /><br />
			<span id="conf"> Confirm Password </span> <input type="password" name="passconfirm" id="pass2"> <br /><br /> 
		</fieldset>
		<fieldset id="coffee">
			Favorite Coffee Style <select name="favoriteCoffee">
				<option value="Latte"> Latte </option>
				<option value="Cappuccino"> Cappuccino  </option>
				<option value="Expresso"> Expresso </option>
			</select> <br /> <br />
			<br /> <br />
			Preferred flavors: 
			<br /> 
			Vanilla <input type="checkbox" value="Vanilla" name="preferredFlavors"> Chocolate <input type="checkbox" value="Chocolate" name="preferredFlavors"> Hazelnut <input type="checkbox" value="Hazelnut" name="preferredFlavors">  <br /> <br />
			Favorite Major Chain: <br />
			Starbucks <input type="radio" value="Starbucks" name="favoriteMajorChain"> Bigby <input type="radio" value="Bigby" name="favoriteMajorChain"> Caribou <input type="radio" value="Caribou" name="favoriteMajorChain">
			<br  /> <br />
		</fieldset>
		Tell us why you want to join! 
		<br />
		<textarea id="txt" name="joinReasons"> Enter here </textarea> <br />
		<input type="submit" value="Register"> 

	</form>
</body>
</html>