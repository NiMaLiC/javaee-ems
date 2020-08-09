<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="Login">
 Email ID:<input type="text" name="email" /><br/>
 Password:<input type="password" name="pass" /><br/>
 Type: <select name = 'type'>
 <option value = 'manager'>Manager</option>
 <option value = 'admin'>Admin</option>
 </select>
 <input type="submit" value="login" />
 </form> 


</body>
</html>