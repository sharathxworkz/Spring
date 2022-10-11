<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
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
<c:forEach items="${cities}" var="city">
< form:select name="cities">
			<option>${city.cities}</option>
			</select>
</c:forEach>
<br>
<input type="submit" value="send"/>
</pre>
</form>
</body>
</html>