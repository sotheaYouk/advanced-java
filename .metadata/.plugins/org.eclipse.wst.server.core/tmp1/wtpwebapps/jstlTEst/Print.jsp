<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var = "name" value= "${param.user}"/>
	<h2>Welcome <c:out value = "${name}"/>!</h2>
	<c:remove var = "name"/>
<!-- 	it doesn't print "null" because the variable is also remove	
 -->	
 
 <c:out value = "${name}"/>
 
 <form action = "Validate">
 	<input type = "submit" value = "next">
 </form>
 
 

</body>
</html>