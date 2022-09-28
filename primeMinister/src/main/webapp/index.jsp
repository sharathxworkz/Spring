<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details Of PrimeMinister</title>
</head>
<body>
<form action="pm" method="post">
PrimeMinister Name:<input type = "text" id="name" name="pName" placeholder="Enter Prime Minister Name"/>
<br>
PrimeMinis Country:<input type="text" id="count" name="country" placeholder="Enter Prime Minister Country">
<br>
Marriage Status:
Married:<input type="radio" name="status" value="Married"/>
UnMarried:<input type="radio" name="status" value="UnMarried"/>
<br>
<label for="Party">Select Your Party</label>
Party:<select name="party" id="part">
				<option value="bjp">BJP</option>
				<option value="app">APP</option>
				<option value="Rss">RSS</option>
				<option value="cong">Congress</option>
			  </select>
<br>
Age:<input type="text" id="ag" name="age" placeholder="Enter Your Age"/>
<br>
Gender:
<br>
Female:<input type="radio" name="gender" value="Female"/>
Male:<input type="radio" name="gender" value="Male"/>
Other:<input type="radio" name="gender" value="Others"/>
<br>
Period Of Time:<input type="text" id="time" name="ptime" placeholder="Enter The Time Span"/>
<br>
<label for="Representer">Select No Of Times Represented</label>
Party:<select name="times" id="time">
				<option value="1">Once</option>
				<option value="2">Twice</option>
				<option value="3">Trice</option>
				<option value="4">Fourth</option>
			  </select>
<br>
<input type="submit" value="send"/>
</form>
</body>
</html>