<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@page isELIgnored="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Here Are All The Details Entered</h1>
	<%
	String Name = (String) request.getParameter("aName");
	String Company= (String)request.getAttribute("company");
	String YearOfStart = (String)request.getAttribute("year");
	String PresentVersion = (String)request.getAttribute("version");
	String NoOfEmployees = (String)request.getAttribute("capacity");
	String Technology = (String)request.getAttribute("tech");
	%>
	<div>
		<table>
			<thead>
				<tr>
					<th>Name</th>
					<th>Company</th>
					<th>Year-Of-Start</th>
					<th>Current-Software-Version</th>
					<th>No-Of-Employees</th>
					<th>Technology-Used</th>
				</tr>
			</thead>
			<tbody>
			
				<tr>
					<td>${Name}</td>
					<td>${company}</td>
					<td>${year}</td>
					<td>${version}</td>
					<td>${capacity}</td>
					<td>${tech}</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>