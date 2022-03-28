<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="stone.Amber" %>
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
body {background-color : #808080; 
background-image : url("https://godyaykin.ru/wp-content/uploads/2020/11/IMG_7988_topaz_Clarity.jpg");
background-blend-mode: color-dodge;
}
</style>
<body text = "#120a8f">

Clarity: <%= request.getAttribute("amberClarity") %>
Weight: <%= request.getAttribute("amberWeight") %>gr
<br>

Let's input the parameters of the next amber 

<% if(request.getParameter("amberWeight") == null) {
	out.println("You haven't added any ambers yet.");
}%>

<% String w = request.getParameter("amberWeight"); %>

<form method="post">
	<label>WEIGHT:
		<input name = "amberWeight" type = "number" step = "any"/>
		<br></br>
	</label>
	<label>CLARITY:
		<input name = "amberClarity" type = "number"/>
		<br></br>
	</label>
	<button type="submit">Submit</button>
	<br>
</form>
<form action="http://localhost:8083/stones_web/AmberNecklaceServlet">
<button>VIEW ALL</button>
</form>

</body>
</html>