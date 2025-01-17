<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrations</title>
</head>
<body>
      <table border="1">
      <tr>
      <th>first name</th>
      <th>last name</th>
      <th>Email</th>
      <th>Mobile</th>
      <th>Delete</th>
      </tr>
      <c:forEach var="registration" items="${registrations }">
      <tr>
      <td>${registration.firstName }</td>
      <td>${registration.lastName }</td>
      <td>${registration.email }</td>
      <td>${registration.mobile }</td>
      <td><a href="delete?id=${registration.id }">delete</a></td>
      </tr>
      </c:forEach>
      </table>
</body>
</html>