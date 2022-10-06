<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Data Of Sucide Commited</title>
</head>
<body>
Message:${message.name};

<form action= "create.do" method="post">
<pre>
Name: <input type="text" name="name"/><br>
Age: <input type="text" name="age" /><br>
Reason: <textarea rows="3" cols="17" name="reason"></textarea><br>
Gender: <input type="radio" name="gender" value="female" />Female<br>
	<input type="radio" name="gender" value="male" />Male<br>
  <input type="radio" name="gender" value="others" />Others<br> 
No-Of-Attempts:<input type="text" name="attempt"/><br>
Spot:<input type="text" name="spot">	<br>
DateAndTime:<input type="text" name="dateAndTime">
<br>
Type:<select name="type">
	<option>Poison</option>
	<option>Hanging</option>
	<option>Jumping From Building</option>
	<option>Cutting Nerve Vessel</option>
	<option>jumping into bhavi,nadi,kere</option>
	</select>	
<br>
<input type="submit" value="Send" style="color:white;background:blue"/>
</pre> 
</form>
</body>
</html>