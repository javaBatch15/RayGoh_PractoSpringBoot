<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="stag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor List</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 60%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
</style>
</head>
<body style="background-color: #FFFFE0;">

<div style="margin-top:50px; margin-left:200px; height:50px;"><h2>Employee List</h2></div>
	<table style="margin-top: 0px;margin-left: 100px; ">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Rating</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach items="${doctorList}" var="doctor">
			<tr>
				<td>${doctor.firstName}</td>
				<td>${doctor.lastName}</td>
				<td>${doctor.rating}</td>
				<td>
					<a href="/edit?id=${doctor.id}" >Edit</a>
				</td>
				<td>
					<form action="/delete?id=${doctor.id}" method="post">
						<input type="submit" value="Delete" style="background:none;border:0px;cursor: pointer;"/>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
