<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache,no-store,no-revalidate");//Http 1.1
response.setHeader("Pragma","Cache-Control"); //Http 1.0
response.setHeader("Expires", "0");
if(session.getAttribute("emailid") == null){
	response.sendRedirect("login.jsp");
}
%>

Welcome manager....
</body>
</html>