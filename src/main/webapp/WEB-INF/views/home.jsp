<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p>Navigation:
<a href="/vote">Options & Votes</a>
<a href="/review"> Review Options </a>
</p>

<h1>Parties</h1>

	<table>
		<tr>
			<th>Name</th><th>Date</th>
		</tr>
		<c:forEach items="${party}" var="party" >
	    <tr>
	    	<td><c:out value= "${ party.name }" /></td>
			<td><c:out value= "${ party.date }" /></td>
			<a href="/democracy-by-party?party=${party.id}">Select Party</a>
		</tr>
		</c:forEach>
	</table>
</body>
</html>