<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<br>
<form action="save.do" method="post">
<a href = "display.do">Display All</a><br>
Name:<input type="text" name="aName" id="nam"/>
<br>
<br>
Company:<input type="text" name="company" id="com"/>
<br>
<br>
Year:<input type="text" name="year" id="yer"/>
<br>
<br>
Version:<input type="text" name="version" id="version"/>
<br>
<br>
Size:<input type="text" name="capacity" id="cap"/>
<br>
<br>
Technology:<input type="text" name="tech" id="tec"/>
<br>
<br>
<input type="submit" value="Save"/>
</form>
</body>
</html>