<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ page import="java.util.List" %>
<%@ page import="stone.Amber" %>
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
<style>
h3 {
text-align: center;
text-shadow: 2px 2px #D2691E;
}
</style>
<body text = "#191970">
<div>
	<h3>Amber Necklace</h3>
</div>
<% double sum = 0;%>
<div>
	<c:set var = "sum" value = "0"></c:set>
	<c:if test = "${amberNecklace.isEmpty() == true}">
	<b>There are no ambers so far</b>
	<br>
	</c:if>
	<c:if test = "${amberNecklace.isEmpty() == false}">
	<b>Ambers from the cheapest to the most expensive</b>
	<br>
	</c:if>
	<c:forEach items = "${amberNecklace}" var = "amber">
	<c:out value="${amber.toString()}"/>
	It's price is 
	<c:out value ="${amber.countPrice()}$."/>
	All stones cost 
	${sum = sum + amber.countPrice()}
	<br>
	</c:forEach>
	Total price is 
	<c:out value = "${sum}"/>
</div>
</body>
</html>