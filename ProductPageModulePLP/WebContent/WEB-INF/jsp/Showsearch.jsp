<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
<link rel="stylesheet" href="css/style1.css" />
</head>
<body>
	<form:form action="displayProduct1.obj" modelAttribute="product"
		method="post">
		<h1 class="header1">
			<b>Welcome</b>
		</h1>
		<div class="personal"><h4>
Category:<form:select path="category">
			<form:option value="Select Product"></form:option>
			<form:options items="${category}"></form:options>
			<br>
			<br>
			<input class="button" type="submit" value="Search">
			<br>
		</form:select></h4></div><br><br><br>
		<div class="personal">
			Please Enter Product to search: <input type="text" name="namesearch" />
			<input class="button" type="submit" value="Search">
		</div>
	</form:form>
	
	
</body>
</html>