<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="Welcome to JSTL !!!"></c:out>
	<br>
	<c:out value=" Id: "></c:out>
	<c:out value="${requestScope.DOC.id }"></c:out>
	<br>
	<c:out value=" Name: "></c:out>
	<c:out value="${requestScope.DOC.name }"></c:out>
	<br>
	<c:out value=" Qualification: "></c:out>
	<c:out value="${requestScope.DOC.qualification }"></c:out>
	<br>
	<c:out value=" Fees :"></c:out>
	<c:out value="${requestScope.DOC.fees }"></c:out>
	<br>
	<c:out value=" Experience: "></c:out>
	<c:out value="${requestScope.DOC.experience }"></c:out>
	<br>
	<c:out value=" Gender: "></c:out>
	<c:out value="${requestScope.DOC.gender }"></c:out>
	<br>
</body>
</html>