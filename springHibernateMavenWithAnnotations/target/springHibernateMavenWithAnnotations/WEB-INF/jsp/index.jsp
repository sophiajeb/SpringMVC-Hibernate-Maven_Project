<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>University Enrollments</title>
 
    <style>
        tr:first-child{
            font-weight: bold;
            background-color: #C6C9C4;
        }
    </style>
 
</head>
 
 
<body>
    <h2> List of Users </h2>  
    <table>
        <tr>
            <td>id</td><td>Username</td><td>Password</td><td>First Name</td><td>Last Name</td><td>Type</td><td></td>
        </tr>
        <c:forEach items="${user}" var="user">
            <tr>
            <td><a href="<c:url value='/edit-${user.id}-user' />">${user.id}</a></td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.fname}</td>
            <td>${user.lname}</td>
            <td>${user.type}</td>
            
            <td><a href="<c:url value='/delete-${user.id}-user' />">delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="<c:url value='/new' />">Add New User</a>
</body>
</html>