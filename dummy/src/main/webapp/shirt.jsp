<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="shirt" method="post">
<pre>
Brand:<input type="text" name="brand"/><br>
Size:<select name="size">
	<option>S</option>
	<option>M</option>
	<option>L</option>
	<option>Xl</option>
	<option>xxl</option>
	<option>xxxl</option>
	</select><br>
Price:<input type="text" name="price"/><br>	
Discount:<select name="discount">
	<option>1%</option>
	<option>5%</option>
	<option>10%</option>
	<option>20%</option>
	<option>27%</option>
	<option>30%</option>
	</select><br>
Quantity:<select name="quantity">
		<option>select</option>
		<c:forEach begin ="1" end="1000" var="index">
		<option value="${index}">${index}</option>
		</c:forEach>
	</select><br>	
Gender:<input type="radio" name=gender value="female"/>Female
	   <input type="radio" name=gender value="male"/>Male
	   <input type="radio" name=gender value="others"/>Others	
<br>
Color:<select name="color">
	<option>Black</option>
	<option>Blue</option>
	<option>Grey</option>
	<option>Red</option>
	<option>White</option>
	<option>Green</option>
	</select><br>

<input type="submit" value="Send"/>				
</pre> 
</form>
</body>
</html>