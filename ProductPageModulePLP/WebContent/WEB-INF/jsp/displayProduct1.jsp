<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="m" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="j" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>products</title>
<link rel="stylesheet" href="css/style1.css" />
</head>

<body>
<h1 class="header1">Products</h1>
<br>

<h2>
<j:form action="displaySimilarProduct.obj" modelAttribute="product">
<j:input path="category" type="hidden"/>
<j:select path="type">
			<j:option value="Select type"></j:option>
			<j:options items="${types}"></j:options>
</j:select>
<input class="button" type="submit" value="similar products"/>
</j:form></h2>
<br><br>
<m:forEach var="ger" items="${products}">
<div  class="personal1"><table>
<tr><td>Name:	</td>	<td>${ger.productName}</td></tr>
<tr><td>About:	</td>	<td>	${ger.description}</td></tr>
<tr><td>Price:	</td>	<td>		${ger.price}</td></tr>
<tr><td>Type:	</td>	<td>		${ger.type}</td></tr>
<tr><td>Category:	</td>	<td>${ger.category}</td></tr></table>
</div>
<br>
</m:forEach>


<m:forEach var="gerund" items="${productsCategory}">
<div  class="personal1"><table>
<tr><td>Name:		</td>	<td>	${gerund.productName}</td></tr>
<tr><td>About:		</td>	<td>	${gerund.description}</td></tr>
<tr><td>Price:		</td>	<td>	${gerund.price}</td></tr>
<tr><td>Type:		</td>	<td>	${gerund.type}</td></tr>
<tr><td>Category:</td>	<td>	${gerund.category}</td></tr></table>
</div>
<br>
</m:forEach>



<strong><font color="red" >${message}</font></strong>
</body>
</html>