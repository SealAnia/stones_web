<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="stone.Diamond" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<style>
body {background-color : #B0E0E6; 
background-image : url("https://www.polsov.com/upload/014/u1405/bf/14/d0a0a42e.jpg");
background-blend-mode: overlay;
}
</style>
<body text = "#800000">

Clarity: <%= request.getAttribute("diamondClarity") %>
Weight: <%= request.getAttribute("diamondWeight") %>ct
<br>

Let's input the parameters of the next diamond

<% if(request.getParameter("diamondWeight") == null) {
	out.println("You haven't added any diamonds yet.");
}%>

<% String w = request.getParameter("diamondWeight"); %>

<form method="post">
	<label>WEIGHT:
		<input name = "diamondWeight" type = "number" step = "any"/>
		<br></br>
	</label>
	<label>CLARITY:
		<input name = "diamondClarity" type = "radio" value = "SV"/>SV
		<input name = "diamondClarity" type = "radio" value = "IF"/>IF
		<br></br>
	</label>
	<button type="submit">Submit</button>
	<br>
</form>
<form action="http://localhost:8083/stones_web/DiamondNecklaceServlet">
<button>VIEW ALL</button>
</form>

</body>
</html>