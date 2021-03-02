<%@page import="com.org.model.Student"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p" %>  <!--  //jstl tag -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <table border="1" align="center" width="70%">  
<tr>
    <h1>Success page</h1>
	<th>Roll no</th>
	<th>First Name</th>
	<th>LastName</th>
	<th>Address</th>
	<th>Mobile no</th>
	<th>User name</th>
	<th>Password</th>
				    </tr> 

 
 <p:forEach var="stu" items="${data}">   
<tr> 
   <td><p:out value="${stu.rollno}"></p:out></td>  
   <td><p:out value="${stu.firstname}"></p:out></td>  
   <td><p:out value="${stu.lastname}"></p:out></td>  
   <td><p:out value="${stu.address}"></p:out></td>
   <td><p:out value="${stu. mobileno}"></p:out></td>
   <td><p:out value="${stu.username }"></p:out></td>
   <td><p:out value="${stu.password}"></p:out></td> 				       
  					       							</tr>
</p:forEach>  


</table>
</body>
</html>