<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="m" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="j" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Similar Products</title>
<link rel="stylesheet" href="css/style1.css" />
</head>

<body>
<h1 class="header1">Similar products</h1><br><br><br>
<m:forEach var="gerund1" items="${similar}">
<div class="personal1">
Name:     	${gerund1.productName}<br>
About:     	${gerund1.description}<br>
Price:       	${gerund1.price}<br>
Type:       	${gerund1.type}<br>
Category: 	${gerund1.category}<br>
</div><br><br>
</m:forEach>

</body>
</html>