<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter Criminal Data Here</title>
</head>
<body>
Confirmation Message:${Mesg}
<form action="criminal" method="post">
<pre>
Criminal Name:<input type="text" name="criminalName"/><br>
Age:<select name="criminalAge">
		<option>select</option>
		<c:forEach begin ="12" end="100" var="index">
		<option value="${index}">${index}</option>
		</c:forEach>
	</select><br>
Country:<select name="country">
<option>Pakistan</option>
<option>China</option>
<option>USA</option>
<option>England</option>
<option>Europe</option>
<option>India</option>
</select><br>
CrimeType:<select name="criminalType">
<option>Murderd</option>
<option>DrugSupplier</option>
<option>DrugMafia</option>Coun
<input type="submit" value="Send"/>
</pre>
</form>
<a href="DisplayByName.jsp">Search By Criteria</a>
<a href="SearchByMultiples.jsp">Search By Multiple Criteria</a>
<a href="criminal">Criminal Details</a>
</body>
</html>