<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success page</title>
<style>
	body{
		background-color: pink;
		color: white;
		text-align: center;
		font-size: 100px;
		
	}
</style>

</head>
<body>
	${param.user}
	<br>
	${paramValues.pwd}
	<br>
	${sessionScope.color}
</body>
</html>