
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hello world</h1>
this is a help page here data is displayed using modelandview object

<br>
<br>
<br>
<br>
your name is  ${name }

<br>
<br>
<br>
<br>
<c:forEach var="fri"  items="${friend }">
<h1>${fri }</h1>

</c:forEach>

</body>
</html>