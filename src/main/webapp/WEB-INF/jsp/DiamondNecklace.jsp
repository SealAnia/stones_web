<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ page import="java.util.List" %>
<%@ page import="stone.Diamond" %>
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
<style>
h3 {
text-align: center;
text-shadow: 2px 2px #0000FF;
}
</style>
<body text = "#800000">
<div>
	<h3>Diamond Necklace</h3>
</div>
<% double sum = 0;%>
<div>
	<c:set var = "sum" value = "0"></c:set>
	<c:if test = "${diamondNecklace.isEmpty() == true}">
	<b>There are no diamonds so far</b>
	<br>
	</c:if>
	<c:if test = "${diamondNecklace.isEmpty() == false}">
	<b>Diamonds from the cheapest to the most expensive</b>
	<br>
	</c:if>
	<c:forEach items = "${diamondNecklace}" var = "diamond">
	<c:out value="${diamond.toString()}"/>
	It's price is 
	<c:out value ="${diamond.countPrice()}$."/>
	All stones cost 
	${sum = sum + diamond.countPrice()}
	<br>
	</c:forEach>
	Total price is 
	<c:out value = "${sum}"/>
</div>
</body>
</html>