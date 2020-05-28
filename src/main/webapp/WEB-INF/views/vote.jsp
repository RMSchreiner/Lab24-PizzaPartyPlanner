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
<a href="/home">Parties</a>
<a href="/review"> Review Options </a>
</p>

<h1>Pizza Options</h1>

<table>
		<tr>
			<th>Name</th><th>Description</th><th>Votes</th>
		</tr>
		<c:forEach items="${partyoption}" var="partyoption" >
	    <tr>
	    	<td><c:out value= "${partyoption.name}" /></td>
			<td><c:out value= "${partyoption.description}" /></td>
			<td><c:out value= "${partyoption.votes}" /></td>
			<td><a href = "/voteadd?id=${partyoption.id}&name=${partyoption.name}&description=${partyoption.description}&votes=${partyoption.votes}">Vote</a><td>
		</tr>             
		</c:forEach>
	</table>
	
<h2>Add an option</h2>

<form action="/optionadd">
  <label for="name">Name:</label><br>
  <input type="text" id="name" name="name"><br>
  <label for="description">Description:</label><br>
  <input type="text" id="description" name="description"><br><br>
  <input type="submit" value="Submit">
</form>

</body>
</html>