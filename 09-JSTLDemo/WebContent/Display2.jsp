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
	<c:if test="${requestScope.DOC.experience>10}">
		<c:out value="He is Experienced"></c:out>
	</c:if>
	<c:if test="${requestScope.DOC.experience<=10}">
		<c:out value="He is new to profession"></c:out>
	</c:if>
	<br>
	<c:if test="${requestScope.DOC.gender=='Male'}">
		<c:out value="Doctor's gender is male"></c:out>
	</c:if>
	<c:if test="${requestScope.DOC.gender=='Female'}">
		<c:out value="Doctor's gender is Female"></c:out>
	</c:if>
	<br>
	<c:if test="${requestScope.DOC.fees>1000}">
		<c:out value="Doctor's fees is more"></c:out>
	</c:if>
	<c:if test="${requestScope.DOC.fees<=1000}">
		<c:out value="Doctor's fees is less"></c:out>
	</c:if>
	
	
	
	
</body>
</html>