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

	<c:forEach items = "${emp}" var = "temp">
		
		<!-- simple validation -->
		<%-- <c:if test= "${temp.user == 'Joy'}" >
			<c:out value = " Welcome"/>	
		</c:if>
		
		<c:if test= "${temp.user != 'Joy'}" >
			<c:out value = " Not Welcome"/>	
		</c:if> --%>
		
		<%-- <c:out value = "${temp}"/> --%>
		<c:out value = "${temp.user}"/>
		<c:out value = "${temp.id}"/>
		
		<br>	
	</c:forEach>
	
	
	<form action= "DB.jsp">
		<input type= "submit" value= "DB">
	
	</form>
	
	
	

</body>
</html>