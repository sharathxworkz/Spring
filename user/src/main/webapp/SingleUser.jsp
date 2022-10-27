<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Images</title>
</head>
<body>

	<table border="1">
		<thead>
			<tr>
				<th>User_Id</th>
				<th>UserName</th>
				<th>UserEmail</th>
				<th>ProfilePicName</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${UserData}" var="data">
				<tr>
					<td>${data.id}</td>
					<td>${data.userName}</td>
					<td>${data.userEmail}</td>
					<td><img src="user/image?fileName=${data.fileName}" width="200px" height="200px"></img> </td>			
					</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>