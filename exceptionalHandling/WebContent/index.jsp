<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>


</head>
<body >
	Hello from Index 
	<jsp:useBean id="beanie" class="bean.MyBean" scope = "request"></jsp:useBean>
	
	<!-- "beanie is the obj created for MyBean class"  -->
	
	
	<jsp:setProperty name="beanie" property = "id" value = "123"></jsp:setProperty>
	<jsp:setProperty name = "beanie" property = "user" value = "Jennie"></jsp:setProperty>
	
	<jsp:forward page="NextPage.jsp"></jsp:forward>
	
	
	<%-- 	<jsp:param value="Sothea" name="user"/>
	</jsp:forward> --%>
	<!-- <a href = "NextPage.jsp">Next</a> -->
</body>
</html>