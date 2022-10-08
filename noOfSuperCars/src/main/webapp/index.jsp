<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Details About SuperCars</h2>
CarDetails:${CarName.cName}
CarDetails:${CarName.nName}
<form action="cars.do" method="post">
<pre>
Name:<input type="text" name="cName"/><br>
NickName:<input type="text" name="nName"/><br>
Manufacture:<input type="text" name="manufacture"/><br>
Price:<input type="text" name="cost"/><br><br>
<input type="submit" value="Save"/><br>
</pre>
</form>
</body>
</html>