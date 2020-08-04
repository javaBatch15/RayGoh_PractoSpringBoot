<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Registration</title>
<style>
td, th {
  font-family: arial, sans-serif;
}
</style>
</head>
<body style="background-color: #FFFFE0;">
<div style="margin-top:50px; margin-left:250px; height:50px;"><h2>Doctor
<%--    <c:out value="${doctor.id != null ? 'Update' : 'Registration' }" />--%>
</h2></div>
<form:form method="POST" modelAttribute="doctor" action="/home" name="doctor">
<table style="vertical-align: center; margin-left:20%;">
	
	<tr>
		<td><form:hidden path="id"/></td>
	</tr>
    <tr>
        <td>First Name :</td>
        <td><form:input path="firstName" id="fname" /></td>
    </tr>
    <tr>
        <td>Last Name :</td>
        <td><form:input path="lastName" id="lname"/></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="<c:out value="${doctor.id != null ? 'Update' : 'Register' }" />"
         onclick="return validate();">&nbsp;&nbsp
         </td>
    </tr>
</table>
</form:form>

</body>
</html>
