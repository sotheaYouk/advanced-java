<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Next Page</title>
</head>
<body style = "background-color:#FFA07A	 ; color: #FFFFFF">
	<%-- <br>
	Hello from next page
	<br>	
	<h3>welcome: ${param.username}</h3>
	 --%>
	<jsp:useBean id="beanie" class= "bean.MyBean" scope= "request"></jsp:useBean>
	<jsp:getProperty property="id" name="beanie"/>
	<jsp:getProperty property="user" name="beanie"/>

</body>
</html>