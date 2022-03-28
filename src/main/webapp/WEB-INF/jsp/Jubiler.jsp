<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>For jubiler</title>
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	</head>
<style>
body {
background-color: #98FB98;
}
</style>
<body>

<div><h4><b>Which kind of stone do you need?</b></h4></div>
<br></br>

<div>
<form action="http://localhost:8083/stones_web/AddDiamondServlet">
	<label>
		<input name = "stone" type = "submit" value = "DIAMOND"/>
	</label>
<br></br>
</form>
<form action="http://localhost:8083/stones_web/AddAmberServlet">
	<label>
		<input name = "stone" type = "submit" value = "AMBER"/>
	</label>
<br></br>
</form>
</div>

</body>
</html>