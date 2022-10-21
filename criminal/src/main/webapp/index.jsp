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
<form action="criminal" method="post" enctype="multipart/form-data">
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
<option>DrugMafia</option>
<option>Kidnaper</option>
</select><br>
NoOFCases:<select name="noOfCases">
		<option>select</option>
		<c:forEach begin ="1" end="100" var="index">
		<option value="${index}">${index}</option>
		</c:forEach>
	</select><br>
Alive:<input type="radio" name="alive" value="Yes">YES&nbsp<input type="radio" name="alive" value="No">NO
<br>
Gender:<input type="radio" name="gender" value="female">Female
	  <input type="radio" name="gender" value="male">Male
	  <input type="radio" name="gender" value="male">Others
<br>
International:<input type="radio" name="international" value="Yes">Domestic&nbsp&nbsp&nbsp <input type="radio" name="international" value="No">International
<br>
Married:<input type="radio" name="married" value="Yes">YES&nbsp&nbsp&nbsp <input type="radio" name="married" value="No">NO
<br>
NoOFCases:<select name="jailTerm">
		<option>select</option>
		<c:forEach begin ="1" end="25" var="index">
		<option value="${index}">${index}</option>
		</c:forEach>
	</select><br>
WifeName:<input type="text" name="wifeName"/><br>
RightHandNameL:<input type="text" name="rightHandName"/><br>
LeftHandName:<input type="text" name="leftHandName"/><br>
JailName:<input type="text" name="prisonName"/><br>
NetWorth:<input type="text" name="netWorth"/><br>
ImagesFile:<input type="file" name="image"/><br><br>
<input type="submit" value="Send"/>
</pre>
</form>
<a href="DisplayByName.jsp">Search By Criteria</a>
<a href="SearchByMultiples.jsp">Search By Multiple Criteria</a>
<a href="criminal">Criminal Details</a>
</body>
</html>