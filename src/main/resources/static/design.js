function display() {
	var firstName = document.getElementById("lastname").value; 
	document.write("Hello " + firstName + "!"); 
}

function validate() {
	if (validateUsrPass() && validatePassword() && validatePhoneNumber() && validateEmail() && validateTextArea()) {
		return true;
	} else {
		return false; 
	}
	
	
}

function validateUsrPass() {
	if (document.getElementsByName("firstname")[0].value == "" || document.getElementsByName("lastname")[0].value == "") {
		alert("Error, name cannot be blank");
		return false;
	} else {
		return true; 
	}
}

function validatePassword() {
	if (document.getElementsByName("pass")[0].value == "" || document.getElementsByName("passconfirm")[0].value == "") {
		alert("Error, password is blank");
		return false
	} else if (document.getElementsByName("pass")[0].value !== document.getElementsByName("passconfirm")[0].value) {
		alert ("Error, passwords do not match")
		return false
	} else {
		return true
	}
	
}

function validatePhoneNumber() {
	var number = document.getElementsByName("phonenumber")[0].value; 
	var regex = /^\d{10}$/;
	if (regex.test(number)) {
		return true;
	} else {
		alert("Error, invalid phone number");
		return false; 
	}
}

function validateTextArea() {
	var txto = document.getElementById("txt").value; 
	if (txto === null) {
		alert("Invalid reason"); 
		return false
	} else {
		return true; 
	}
}

function email() {
	var regex = /^.+@[a-z]+\.(com||net)$/;
	var email = document.getElementsByName("email")[0].value; 
	if (regex.test(email)) {
		return true; 
	} else {
		alert("Error: Invalid email"); 
		return false; 
	}
}

function confirmDelete() {
	return window.confirm("Are you sure you want to delete?");
	
}
