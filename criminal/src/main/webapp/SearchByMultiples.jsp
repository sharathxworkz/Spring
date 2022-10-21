<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Search By Multiple Data Criteria</h2>
<form action ="criminal/findByMany">
<pre>
CriminalAge:<input type="text" name="criminalAge"/><br>
CriminalCountry:<input type="text" name="country"/><br>
Gender:<input type="radio" name="gender" value="female"/>Female
	<input type="radio" name="gender" value="male"/>Male
	<input type="radio" name="gender" value="others"/>Others
<br>
<input type="submit" value="Search"/>	
	</pre>	
</form>
</body>
</html>