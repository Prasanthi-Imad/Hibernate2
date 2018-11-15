<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Doctor's list</title>
</head>
<body>
	
		<table border = "2">
		<tr bgcolor="pink">
		<th><c:out value="Id"></c:out></th>
		<th><c:out value="Name"></c:out></th>
		<th><c:out value="Qualification"></c:out></th>
		<th><c:out value="Gender"></c:out></th>
		<th><c:out value="Experience"></c:out></th>
		<th><c:out value="Fees"></c:out></th>
		</tr>
		<c:forEach items="${sessionScope.DOCTORS}" var="d">
			<tr>
				<td><c:out value="${d.id }"></c:out></td>
				<td><c:out value="${d.name }"></c:out></td>
				<td><c:out value="${d.qualification }"></c:out></td>
				<td><c:out value="${d.gender }"></c:out></td>
				<td><c:out value="${d.experience }"></c:out></td>
				<td><c:out value="${d.fees }"></c:out></td>
			</tr>
			</c:forEach>
		</table>
	<a href="Input.html">Add more doctors</a>
</body>
</html>