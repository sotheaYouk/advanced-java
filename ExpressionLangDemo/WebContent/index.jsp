<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import = "java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home page</title>
</head>
<body>
	<% 
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("color1", "black");
		myMap.put("color2", "blue");
		myMap.put("color3", "brown");
		session.setAttribute("color", myMap);
	
	%>

	<form action = "Success.jsp">
		<input type = "text" name = "user">
		<br>
		<input type = "password" name = "pwd">
		<br>
		<input type = "submit" value = "login">
	
	</form>
</body>
</html>