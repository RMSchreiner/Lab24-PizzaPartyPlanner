<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Navigation:
<a href="/home"> Scheduled Parties </a>
<a href="/vote">Options & Votes</a>
</p>

<h1>Pizza Options</h1>

<table>
		<tr>
			<th>Name</th><th>Description</th><th>Votes</th>
		</tr>
		<c:forEach items="${optionlist}" var="optionlist" >
	    <tr>
	    	<td><c:out value= "${optionlist.name}" /></td>
			<td><c:out value= "${optionlist.description}" /></td>
			<td><c:out value= "${optionlist.votes}" /></td>
		</tr>             
		</c:forEach>
	</table>




</body>
</html>