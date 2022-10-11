<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
 <%@ page isELIgnored="true" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="display.do" method="post">
<pre>
NameOfPerson:<input type="text" name="name">
<br>
EmailIdOfPerson:<input type="text" name="email">
<br>
CityOfPerson:	
<select name="cities">
	<ol>
	<c:forEach var="cit" items="${cities}">
		<li>${cit}</li>
	</c:forEach>
	</ol>
</select>
<input type="submit" value="send"/>
</pre>
</form>
</body>
</html>