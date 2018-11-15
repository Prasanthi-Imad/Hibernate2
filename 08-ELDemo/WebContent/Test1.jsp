<%@page import="com.training.entity.Doctor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Doctor d = new Doctor();
		request.setAttribute("DOC", d);
	%>
	${requestScope.DOC.name }<br>
	${requestScope.DOC.consultantFees }<br>
	${requestScope.DOC.experience }<br>
	${requestScope.DOC.clinic.location }<br>
	
</body>
</html>