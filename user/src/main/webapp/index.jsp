<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Enter Details of Users</h2>
<br>
<form action="user" method="post" enctype="multipart/form-data">
 <pre>
 UserName:<input type="text" name="userName"/><br>
 EmailId:<input type="text" name="userEmail"/><br>
 File:<input type="file" name="file"/><br>
 <br> 
 <input type="submit" name="Search"/>
 </pre>
</form>
<a href="user">Click To See Details</a>
<a href="seachByName.jsp">Click To Search</a>
</body>
</html>