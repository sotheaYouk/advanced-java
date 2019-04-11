<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="cr" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<sql:setDataSource var="mydb" 
						url="jdbc:mysql://localhost:3306/test" 
						user="root" 
						password="root" 
						driver= "com.mysql.jdbc.Driver"/>
						
	<sql:query dataSource="${mydb}" var="record">
		select * from student;
	</sql:query>
	<br>
	
	<cr:forEach items = "${record.rows}" var = "rs">
		<cr:out value= "${rs.id}"/>
		<cr:out value= "${rs.name}"/>
		<br>			
	</cr:forEach>
	
	<sql:update dataSource="${mydb}" var ="rows">	
		insert into student values ('4224','NewStudent');
	</sql:update>
	
	
	
</body>
</html>